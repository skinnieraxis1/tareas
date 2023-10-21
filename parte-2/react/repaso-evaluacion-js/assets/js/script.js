const eleccionI = prompt("Ingrese 1 o 0:")

const title = document.getElementById("titulo")
const img = document.getElementById("img")

if (eleccionI.includes("1")){
    ocupado()
}else if (eleccionI.includes("0")){
    libre()
}

function ocupado(){
    title.innerHTML = "Ocupado";
    img.src = "./assets/img/ocupado.jpg"
}

function libre(){
    title.innerHTML = "Libre";
    img.src = "./assets/img/libre.jpg"
}