import {lessThanFive, onlyEvenNumbers, onlyOddNumbers, shorterThanFive} from "./filter";

describe('filtering', () => {
    const oneThroughSix = [1, 2, 3, 4, 5, 6]
    const oddNumbers = [1, 3, 5, 7, 9, 11]

    describe('lessThanFive()', () => {
        it('returns a new array with the numbers less than five', () => {
            const result1 = lessThanFive(oneThroughSix)
            const result2 = lessThanFive(oddNumbers)

            expect(result1).toEqual([1, 2, 3, 4])
            expect(result2).toEqual([1, 3])
        })
    })

    describe('onlyEvenNumbers()', () => {
        it('returns a new array with only the even numbers', () => {
            const result1 = onlyEvenNumbers(oneThroughSix)
            const result2 = onlyEvenNumbers(oddNumbers)

            expect(result1).toEqual([2, 4, 6])
            expect(result2).toEqual([])
        })
    })

    describe('onlyOddNumbers()', () => {
        it('returns a new array with only the odd numbers', () => {
            const result1 = onlyOddNumbers(oneThroughSix)
            const result2 = onlyOddNumbers(oddNumbers)

            expect(result1).toEqual([1, 3, 5])
            expect(result2).toEqual([1, 2, 3, 4, 5, 6])
        })
    })

    describe('shorterThanFive()', () => {
        it('returns a new array with only words of less than five characters', () => {
            const numberWords = ["one", "two", "three", "four"]

            const result = shorterThanFive(numberWords)

            expect(result).toEqual(["one", "two", "four"])
        })
    })
})
