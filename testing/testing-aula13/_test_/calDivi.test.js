const { divisao } = require('../calc.js');

describe('Teste de divisão', () =>{

    test('Divisão de dois numeros', () =>{
        expect(divisao(5,5)).toBe(1);
    })

    test('Divisão de nulos', () =>{
        expect(divisao(null,null)).toBe(NaN);
    })

    test('Divisão de duas strings', () =>{
        expect(divisao("a","b")).toBe(NaN);
    })

    test('Divisão com valor negativo', () =>{
        expect(divisao(-2,4)).toBe(-0.5);
    })

});
