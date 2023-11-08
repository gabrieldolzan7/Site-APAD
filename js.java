const carousel = document.querySelector(".carousel");
const images = document.querySelectorAll(".carousel img");

let currentIndex = 0;

function nextSlide() {
    currentIndex = (currentIndex + 1) % images.length;
    updateCarousel();
}

function previousSlide() {
    currentIndex = (currentIndex - 1 + images.length) % images.length;
    updateCarousel();
}

function updateCarousel() {
    images.forEach((image, index) => {
        if (index === currentIndex) {
            image.style.transform = "translateX(0)";
        } else {
            image.style.transform = "translateX(100%)";
        }
    });
}

setInterval(nextSlide, 5000); // Trocar automaticamente as imagens a cada 5 segundos

updateCarousel(); // Inicialize o carrossel
