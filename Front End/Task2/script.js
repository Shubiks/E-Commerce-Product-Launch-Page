document.getElementById('registrationForm').addEventListener('submit', function(event) {
    // Get the form elements
    const email = document.getElementById('email');
    const password = document.getElementById('password');

    // Email validation using regex
    const emailPattern = /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,6}$/;
    if (!emailPattern.test(email.value)) {
        alert('Please enter a valid email address.');
        email.focus();
        event.preventDefault(); // Prevent form submission
        return false;
    }

    // Password length validation
    if (password.value.length < 8) {
        alert('Password must be at least 8 characters long.');
        password.focus();
        event.preventDefault(); // Prevent form submission
        return false;
    }

    // If both validations pass, the form will be submitted
    alert('Registration successful!');
});
