document.getElementById('fetchButton').addEventListener('click', () => {
    fetch('userData.json')
        .then(response => response.json())
        .then(data => {
            const resultDiv = document.getElementById('result');
            resultDiv.innerHTML = ''; // Clear previous results
            data.forEach(user => {
                const userDiv = document.createElement('div');
                const addressElement = document.createElement('address');
                addressElement.textContent = user.address;
                userDiv.appendChild(addressElement);
                resultDiv.appendChild(userDiv);
            });
        })
        .catch(error => console.error('Error fetching user data:', error));
});