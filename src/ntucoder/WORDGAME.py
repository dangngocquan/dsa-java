# Time limit exceed 

m = 0
n = 0
d = 0
word = ""
board = []
count = 0

def dfs(char_number, row_index, column_index, temp_string):
    global count
    if char_number > m+n-1:
        if word in temp_string:
            count = (count + 1) % d
    else:
        if row_index == m-1:
            dfs(char_number+1, row_index, column_index + 1, temp_string + board[row_index][column_index])
        elif column_index == n-1:
            dfs(char_number+1, row_index+1, column_index, temp_string + board[row_index][column_index])
        else:
            dfs(char_number+1, row_index, column_index + 1, temp_string + board[row_index][column_index])
            dfs(char_number+1, row_index+1, column_index, temp_string + board[row_index][column_index])

if __name__ == '__main__':
    list_input = input().split()
    m = int(list_input[0])
    n = int(list_input[1])
    d = int(list_input[2])
    word = input()
    for row in range(m):
        temp_list = []
        temp_string = input()
        for char in temp_string:
            temp_list.append(char)
        board.append(temp_list)
    
    dfs(1, 0, 0, "")
    print(count)
    