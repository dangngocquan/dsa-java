def readFile(path, mode, separator):
    with open(path, mode) as f:
        lst =  f.read().split(separator)
        f.close()
    return lst
    
def reformat(names):
    for index in range(0, len(names)):
        name = names[index]
        names[index] = name[1:(len(name) - 1)]
        
def alphabeticalValue(word):
    answer = 0
    for char in word:
        answer += ord(char.upper()) - ord('A') + 1
    return answer

def getNameScores(names):
    scores = []
    for index in range(0, len(names)):
        score = alphabeticalValue(names[index]) * (index + 1)
        scores.append(score)
    return scores

if __name__ == '__main__':
    names = readFile(".\src\Files\projecteuler\p0022_names.txt", 'r', ',')
    reformat(names)
    names.sort()
    scores = getNameScores(names)
    sumOfNameScores = sum(scores)
    print(sumOfNameScores)          # 871198282