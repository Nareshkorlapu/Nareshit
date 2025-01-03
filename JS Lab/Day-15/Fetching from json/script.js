   fetch('userData.json')
        .then(response => response.json())
        .then(data => {
            data.forEach(user => {
                const userElement = document.createElement('p');
                userElement.textContent = user.name;
                (document.getElementById('result')).appendChild(userElement);
            });
        })
                .catch(error => console.error('Error fetching data:',error));