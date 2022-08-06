if __name__ == '__main__':   
    sum = 0
    numbers = []
    with open("D:\Study\Java\WithEclipse\TrainingAlgorithms\src\Files\projecteuler\p0013_numbers.txt", 'r') as f:
        numbers = f.read().splitlines()
        f.close()
    for number in numbers:
        sum += int(number)
    print((str(sum))[0:10])     # 5537376230