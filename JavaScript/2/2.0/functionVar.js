var varGeneral = "Si existe"

function testA(){
    var varLocal = "No existen fuera"
    console.log(`Las variables var ${varLocal} de la funcion`)
}

testA()

if (typeof(varLocal) === 'undefined'){
    console.log(`Como vemos afuera no esta declarada diferente a la que esta afuera que ${varGeneral}`)
}

function testB(){
    var varGeneral = "Estamos modificando el var general"
    console.log(varGeneral)
}

console.log(`Como podemos ver "${varGeneral}" el var no mantuvo la modificación fuera de la función`)