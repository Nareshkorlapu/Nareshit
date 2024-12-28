// Que 1 :
// ---------

// Form Validation

// Build a Form Validation application where users:

// 	-> Enter data into fields like name, email, and password.
// 	-> Receive instant feedback if fields are invalid (e.g., missing input, invalid email format).
// 	-> Cannot submit the form until all inputs are valid.

// -> Adding validation rules using JavaScript.
// -> Manipulating form elements and displaying error messages dynamically.
// -> Preventing default form submission using event.preventDefault().
document.getElementById('myForm').addEventListener('submit', function(event) {
    event.preventDefault();

    let isValid = true;

    // Name validation
    const name = document.getElementById('name').value;
    const nameError = document.getElementById('nameError');
    if (name === '') {
        nameError.textContent = 'Name is required';
        isValid = false;
    } else {
        nameError.textContent = '';
    }

    // Email validation
    const email = document.getElementById('email').value;
    const emailError = document.getElementById('emailError');
    const emailPattern = /^[^ ]+@[^ ]+\.[a-z]{2,3}$/;
    if (email === '') {
        emailError.textContent = 'Email is required';
        isValid = false;
    } else if (!email.match(emailPattern)) {
        emailError.textContent = 'Invalid email format';
        isValid = false;
    } else {
        emailError.textContent = '';
    }

    // Password validation
    const password = document.getElementById('password').value;
    const passwordError = document.getElementById('passwordError');
    if (password === '') {
        passwordError.textContent = 'Password is required';
        isValid = false;
    } else {
        passwordError.textContent = '';
    }

    if (isValid) {
        alert('Form submitted successfully!');
    }
});