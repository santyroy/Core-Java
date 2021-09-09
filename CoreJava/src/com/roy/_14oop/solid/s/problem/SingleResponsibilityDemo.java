package com.roy._14oop.solid.s.problem;

public class SingleResponsibilityDemo {
    public static void main(String[] args) {
        MailboxSettingsService settingsService = new MailboxSettingsService();
        User user = new User();

        // responsibility #1 of the MailboxSettingsService - change settings in mailbox
        settingsService.changeSecondaryEmail(user, "newemail@email.com");

        // responsibility #2 of the MailboxSettingsService - verify access
        if (settingsService.hasAccess(user)) {
            user.sendMoney(new User(), 1000);
        }
    }
}
