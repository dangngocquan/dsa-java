if __name__ == '__main__':
    number = 600851475143
    largestPrimeFactor = -1
    tempNumber = 2
    while number > 1:
        while number%tempNumber == 0:
            number /= tempNumber
            largestPrimeFactor = tempNumber
        tempNumber += 1
    print(largestPrimeFactor)       # 6857