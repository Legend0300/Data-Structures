import heapq
# Define the graph using an adjacency list
graph = {
    'A': {'B': 1, 'C': 4},
    'B': {'A': 1, 'C': 2, 'D': 5},
    'C': {'A': 4, 'B': 2, 'D': 1},
    'D': {'B': 5, 'C': 1, 'E': 3},
    'E': {'D': 3}
}

# Heuristic function (for example, straight-line distance or estimated cost to goal)
heuristic = {
    'A': 7,
    'B': 6,
    'C': 2,
    'D': 1,
    'E': 0  # Heuristic value for the goal node is always 0
}

def a_star(graph , start , goal):
    open_set = []
    heapq.heappush(open_set , ((0 + heuristic[start]) , start))

    came_from = {}
    g_score = {}
    for node in graph:
        g_score[node] = float("inf")
    g_score[start] = 0

    while open_set:
        current_f_score , current = heapq.heappop(open_set)

        if current == goal:
            path = []
            while current in came_from:
                path.append(current)
                current = came_from[current]
            path.append(start)
            return path[::-1]
        
        for  neighbour, score  in graph[current].items():
            tentative_score = score + g_score[current]
            if tentative_score < g_score[neighbour]:
                came_from[neighbour] = current
                g_score[neighbour] = tentative_score
                f_score = tentative_score + heuristic[neighbour]
        heapq.heappush(open_set , (f_score , neighbour))
    return None
    
path = a_star(graph , "A" , "E")

print(f"Path: {path}")


