// Countdown Timer
// Description: Build a countdown timer that counts down from a specified time.

// Requirements:

// An input field to set the countdown time.

// A start button to begin the countdown.

// A display area to show the remaining time in minutes and seconds.

// An alert when the countdown reaches zero.
var time = document.getElementById('time');
var start = document.getElementById('start');
var display = document.getElementById('display');
function countdown(){
    var timer = setInterval(function(){
        var minutes = Math.floor(time.value/60);
        var seconds = time.value%60;
        display.textContent = minutes + " : " + seconds;
        time.value--;
        if(time.value < 0){
            clearInterval(timer);
            alert("Time is up");
        }
    },1000);
}
start.addEventListener('click',countdown);




