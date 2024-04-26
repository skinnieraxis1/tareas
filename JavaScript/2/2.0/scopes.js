let ejemploA = 0;

{   
    ejemploA++
}

console.log(`El numero ${ejemploA} fue sumado dentro del scope`)

{
    let ejemploB = 1
}

if (typeof ejemploB === 'undefined'){
    console.log("como podemos comprobar las variables let en scope no funcionan fuera de el")
}


{
    var ejemploC = "variables var";
}

console.log(`Sin embargo como vemos las ${ejemploC} si se incluyen en el log `)

let ejemploD = 100;

{
    let ejemploD = 200;
    console.log(`Estoy dentro del log y el ejemplo vale ${ejemploD}`)
}

console.log(`Estoy afuera y el ejemplo vale ${ejemploD} demostrando que las variables let en scope se pueden volver a definir y no solo eso si no que la modificación no se guarda para fuera`)