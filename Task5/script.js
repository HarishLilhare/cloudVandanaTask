// Array of image URLs
const images = [
       '/Task5/images/img1.jpg',
       '/Task5/images/img2.jpg',
       '/Task5/images/img3.jpg',
       '/Task5/images/img4.jpg'

];

let currentIndex = 0;
const slider = document.getElementById("slider");
const prevBtn = document.getElementById("prevBtn");
const nextBtn = document.getElementById("nextBtn");

function updateImage() {
    slider.src = images[currentIndex];
}

updateImage();

nextBtn.addEventListener("click", () => {
    currentIndex = (currentIndex + 1) % images.length;
    updateImage();
});

prevBtn.addEventListener("click", () => {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateImage();
});
