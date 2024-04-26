console.log(`Existen 6 tipos de datos primitivos`)
console.log(``)

// Boolean

let booleanA = true
let booleanB = false

console.log(`Los datos booleanos`)
console.log(`Estos tipos de datos tienen 2 estados ${booleanA} y ${booleanB}`)
console.log(`Si les aplicamos un typeof da ${typeof(booleanA)}`)

// Number

const numberInt = 2006
let numberFloat = 3.1426
let numberMult = numberInt * numberFloat
let numberDiv = numberMult / 2
let numberHexa = 0x10
let numberOctal = 0o10
let numberBi = 0b10
let number0 = 2e5
let numberDeci = 123e-5
let numberInfinito = 1 / 0
let numberMInfinito = -Infinity

console.log(`Los datos ${typeof(numberInt)}`)
console.log(`Estos pueden presentarse de distintas formas.`)
console.log(`Como enteros "${numberInt}" o divisores "${numberFloat}"`)
console.log(`También pueden interactuar de distintas formas`)
console.log(`Como multiplicando int * float = "${numberMult}" o dividiendo mult / 2 = "${numberDiv}" `)
console.log(`También existen distintas numeraciones`)
console.log(`Hexadecimal = "${numberHexa}" ; Octal = "${numberOctal}" ; Binario = "${numberBi}"`)
console.log(`También formas de agregar muchos 0 ya sea para atras como para adelante`)
console.log(`Como 2e5 = "${number0}" o como 123e-5 = "${numberDeci}"`)
console.log(`Tambien formas de poner infinito`)
console.log(`+Infinito = "${numberInfinito}" ; -Infinito = "${numberMInfinito}"`)

// BigInt

let bigA = 9999999999999999999999999999n
let bigB = 7n/4n

console.log(`Los datos ${typeof(bigA)}`)
console.log(`Estos son como number pero se utilizan cuando sabemos que la función o cuenta será o es muy grande`)
console.log(`Como este "${bigA}"`)
console.log(`Con este podemos interactuar igual que con Number, pero sin comas dividiendo asi el total para abajo`)
console.log(`Como este 7 / 4 = "${7n/4n}"`)

// String 

let stringA = "Hola, soy un string"
let stringB = 'Yo también'
let stringC = `y yo`
let stringCi = '100'
let stringX = '10'

console.log(`Los datos ${typeof(stringA)}`)
console.log(`Estos son el tipo de variable de texto, donde uno puede escribir caracteres`)
console.log(`Como este "${stringA}" ; o este '${stringB} ; o este \`${stringC}\` `)
console.log(`Estas variables pueden interactuar entre estas`)
console.log(`Sumando "100" + "10" = "${stringCi + stringX}" (typeof ${typeof(stringCi + stringX)}) ; "Hola, soy un string" + "Yo tambien" = "${stringA + stringB}"`)
console.log(`Pero no restando "100" - "10" = ${stringCi - stringX} (typeof ${typeof(stringCi - stringX)}) ; "Hola, soy un string" - "string" = "${stringA - "string"}"`)