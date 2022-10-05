# 0: 상, 1:좌 2:하 3:우
# dx = [-1, 0, 1, 0]
# dy = [0, -1, 0, 1]
# dirType = [[1, 3], [0, 2], [1, 3], [0, 2]]
# def dfs(x, y, d, cnt):
#     global ans
#     if x == sx and y == sy:
#         ans = min(ans, cnt)
#         return
#     next_d = []
#     if x < 0 or x >= N or y < 0 or y >= N: return
#     if visit[x][y] == 1: return
#     if cnt > dp[x][y][d]: return
#     dp[x][y][d] = cnt
#     if maps[x][y] == 0: return
#     elif 1 <= maps[x][y] <= 2:
#         next_d.append(d)
#     else:
#         next_d = dirType[d]
#     visit[x][y] = 1
#     for nd in next_d:
#         nx, ny = x+dx[nd], y+dy[nd]
#         dfs(nx, ny, nd, cnt+1)
#     visit[x][y] = 0
 
 
print('run script from Jenkins')

    
    
