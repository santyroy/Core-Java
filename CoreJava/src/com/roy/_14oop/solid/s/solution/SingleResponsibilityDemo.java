package com.roy._14oop.solid.s.solution;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {

        User user = new User();

        // responsibility #1 of the MailboxSettingsService - change settings in mailbox
        MailboxSettingsService settingsService = new MailboxSettingsService();
        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        // responsibility #1 of the SecurityService - verify access
        SecurityService securityService = new SecurityService();
        if (securityService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }
}
