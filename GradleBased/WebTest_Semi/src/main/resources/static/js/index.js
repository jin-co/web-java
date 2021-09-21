const navLinks = document.querySelectorAll('.nav-link');

let clicked = [];

let show = function() {
    navLinks.forEach(navLink => {
        navLink.addEventListener('click', (e) => {
            clicked[0] = (e);
            console.log(clicked[0])
    
            removeActive(); 
        })
    });
}
window.addEventListener('load', (e) => {
	e.preventDefault();
	clicked.classList.add('active')
});
show();


function removeActive() {
    navLinks.forEach(navLink => {
        navLink.classList.remove('active');
    });
}

