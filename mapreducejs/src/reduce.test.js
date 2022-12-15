import {sum, product, join} from "./reduce";

describe('reducing', () => {
    const oneThroughSix = [1, 2, 3, 4, 5, 6]
    const oddNumbers = [1, 3, 5, 7, 9, 11]

    describe('sum()', () => {
        it('returns the sum of the numbers in the array', () => {
            const result1 = sum(oneThroughSix)
            const result2 = sum(oddNumbers)

            expect(result1).toEqual(1 + 2 + 3 + 4 + 5 + 6)
            expect(result2).toEqual(1 + 3 + 5 + 7 + 9 + 11)
        })
    })

    describe('product()', () => {
        it('returns the product of the numbers in the array', () => {
            const result1 = product(oneThroughSix)
            const result2 = product(oddNumbers)

            expect(result1).toEqual(2 * 3 * 4 * 5 * 6)
            expect(result2).toEqual(3 * 5 * 7 * 9 * 11)
        })
    })

    describe('join()', () => {
        it('returns a string made up of the words in the array joined together', () => {
            const numberWords = ["one", "two", "three", "four"]

            const result = join(numberWords)

            expect(result).toEqual("onetwothreefour")
        })
    })
})
