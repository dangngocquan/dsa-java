
if __name__ == '__main__':
    # Read file and return a matrix
    matrix = []
    with open('.\\src\\Files\\projecteuler\\p0011.txt', 'r') as f:
        matrix = f.readlines()
        for i in range(len(matrix)):
            matrix[i] = matrix[i].split()
    
    