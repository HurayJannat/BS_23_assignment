# Assignment_BS23
# Daily Finance User Registration and Management Testing

This document outlines the steps to test user registration, login, and management functionalities on the Daily Finance website.

## Testing Steps

### 1. Register a New User

- **Visit**: [Daily Finance](https://dailyfinance.roadtocareer.net/)
- **Action**: Register a new user using your Gmail account.
- **Email Verification**: Check your Gmail inbox for a confirmation email containing a "Congratulations" message.
- **Assertion**: Confirm that the email has been received.

> **Hint**: To register multiple accounts while receiving all emails in your personal Gmail inbox, watch this [video](https://www.youtube.com/watch?v=03zeWrun8G4).

### 2. Password Reset

- **Go to**: The login page on the website.
- **Action**: Click on "Reset it here."
- **Email Verification**: Receive a password reset link via email.
- **Action**: Open the link and set a new password.

### 3. Log In with New Password

- **Action**: Log in using the new password.
- **Assertion**: Confirm that the login is successful.

### 4. Add Items to the List

- **Action**: Add two random items to the list.
- **Assertion**: Verify that both items appear on the item list.

### 5. Update User Profile

- **Go to**: The user profile page.
- **Action**: Update the email address to a new Gmail account.

### 6. Log Out and Log In with Updated Email

- **Action**: Log out of the current session.
- **Action**: Log in using the updated email.
- **Assertion**: Confirm that login is successful with the new email and fails with the previous email.

### 7. Admin Login Verification

- **Action**: Log out again.
- **Action**: Log in using the admin account.
- **Assertion**: Verify that the newly registered user appears on the admin dashboard’s user list.

## Conclusion

This document serves as a guideline for testing user registration and management functionalities on the Daily Finance website. Follow the outlined steps to ensure proper functionality and user management.
