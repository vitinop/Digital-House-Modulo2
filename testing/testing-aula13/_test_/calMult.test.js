const { multiplicacao } = require('../calc.js');

describe('Teste de multiplicação', () =>{

    test('Multiplicação de dois numeros', () =>{
        expect(multiplicacao(5,5)).toBe(25);
    })

    test('Multiplicação de nulos', () =>{
        expect(multiplicacao(null,null)).toBe(0);
    })

    test('Multiplicação de duas strings', () =>{
        expect(multiplicacao("a","b")).toBe(NaN);
    })

    test('Multiplicação com valor negativo', () =>{
        expect(multiplicacao(-2,3)).toBe(-6);
    })

});
