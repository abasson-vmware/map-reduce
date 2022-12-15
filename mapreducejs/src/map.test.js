import {addTwoToEachElement, capitalize, doubleEachElement, squareEachElement} from "./map";

describe('mapping', () => {
    const oneThroughSix = [1, 2, 3, 4, 5, 6]
    const oddNumbers = [1, 3, 5, 7, 9, 11]

    describe('doubleEachElement()', () => {
        it('returns a new array in which each number is doubled', () => {
            const result1 = doubleEachElement(oneThroughSix)
            const result2 = doubleEachElement(oddNumbers)

            expect(result1).toEqual([2, 4, 6, 8, 10, 12])
            expect(result2).toEqual([2, 6, 10, 14, 18, 22])
        })
    })

    describe('squareEachElement()', () => {
        it('returns a new array in which each number is squared', () => {
            const result1 = squareEachElement(oneThroughSix)
            const result2 = squareEachElement(oddNumbers)

            expect(result1).toEqual([1, 4, 9, 16, 25, 36])
            expect(result2).toEqual([1, 9, 25, 49, 81, 121])
        })
    })

    describe('tripleEachElement()', () => {
        it('returns a new array in which each number has been added to two', () => {
            const result1 = addTwoToEachElement(oneThroughSix)
            const result2 = addTwoToEachElement(oddNumbers)

            expect(result1).toEqual([3, 4, 5, 6, 7, 8])
            expect(result2).toEqual([3, 5, 7, 9, 11, 13])
        })
    })

    describe('capitalize()', () => {
        it('returns a new array in which each word capitalized', () => {
            const numberWords = ["one", "two", "three", "four"]

            const result = capitalize(numberWords)

            expect(result).toEqual(["One", "Two", "Three", "Four"])
        })
    })
})
