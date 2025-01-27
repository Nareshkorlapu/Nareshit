// Que 2 :
// --------

// 	Change Body Color with Random Colors on Button Click

// You are creating a webpage where users can click a button to change the background color of the entire page to a random color. This can be useful for creating interactive and visually appealing web applications.

// Steps:

// 	-> Create an HTML file with a button.

// 	-> Add a JavaScript function that generates a random color.

// 	-> Attach an event listener to the button to change the background color when clicked.

function getRandomColor() {
    const letters = '0123456789ABCDEF';
    let color = '#';
    for (let i = 0; i < 6; i++) {
        color += letters[Math.floor(Math.random() * 16)];
    }
    return color;
}

document.getElementById('colorButton').addEventListener('click', function() {
    document.body.style.backgroundColor = getRandomColor();
});
