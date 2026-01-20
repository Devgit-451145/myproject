package com.dev.practice.designpatterns;
//Facade provides a simple, high-level interface to a complex subsystem.
// Clients talk to the Facade; the Facade coordinates many subsystems behind the scenes
// so the client doesn't need to know details.
//when to use
//Many classes form a complex subsystem and clients should not need to know the internals.
public class FacadePattern {
    public static void main(String[] args) {
        MoneyTransferFacade facade = new MoneyTransferFacade();
        boolean result = facade.transferFunds("ACC1001", "ACC2002", 500.00);
        System.out.println(result ? "Transfer success" : "Transfer failed");
    }
}
// Subsystem 1: Account Validation
class AccountValidator {
    boolean isValid(String accountId) {
        // Validate KYC, account status, frozen, closed, etc.
        return true;
    }
}

// Subsystem 2: Fraud Check
class FraudChecker {
    boolean isFraudulent(String fromAccount, double amount) {
        // Real-time rules, device fingerprinting, velocity checks
        return false;
    }
}

// Subsystem 3: Balance Service
class BalanceService {
    boolean hasSufficientBalance(String accountId, double amount) {
        // Check available balance, overdraft, holds
        return true;
    }

    void debit(String accountId, double amount) {}
    void credit(String accountId, double amount) {}
}

// Subsystem 4: Ledger Posting
class LedgerService {
    void postEntry(String fromAccount, String toAccount, double amount) {
        // Core banking double-entry posting
    }
}

// Subsystem 5: Notification Service
class NotificationService {
    void sendTransferSms(String accountId, double amount) {
        // Send SMS/email/alert
    }
}

// Subsystem 6: Audit Logging
class AuditService {
    void log(String message) {
        System.out.println("AUDIT: " + message);
    }
}

class MoneyTransferFacade {

    private AccountValidator validator = new AccountValidator();
    private FraudChecker fraudChecker = new FraudChecker();
    private BalanceService balanceService = new BalanceService();
    private LedgerService ledgerService = new LedgerService();
    private NotificationService notificationService = new NotificationService();
    private AuditService auditService = new AuditService();

    public boolean transferFunds(String fromAcc, String toAcc, double amount) {

        auditService.log("Initiating transfer");
        // 1. Validate accounts
        if (!validator.isValid(fromAcc) || !validator.isValid(toAcc)) {
            auditService.log("Account validation failed");
            return false;
        }
        // 2. Fraud scan
        if (fraudChecker.isFraudulent(fromAcc, amount)) {
            auditService.log("Fraud detected");
            return false;
        }
        // 3. Check balance
        if (!balanceService.hasSufficientBalance(fromAcc, amount)) {
            auditService.log("Insufficient balance");
            return false;
        }
        // 4. Debit & Credit
        balanceService.debit(fromAcc, amount);
        balanceService.credit(toAcc, amount);
        // 5. Ledger posting
        ledgerService.postEntry(fromAcc, toAcc, amount);
        // 6. Notification
        notificationService.sendTransferSms(fromAcc, amount);
        auditService.log("Transfer completed successfully");
        return true;
    }
}
