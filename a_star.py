import heapq

graph = {
    'A': {'B' : 1},
    "B" : {"A" : 1}
    
}

heurestic = {
    "A" : 7,
    "B" : 6
}

def a_star(graph , start , goal):
    open_set = []
    heapq.heappush(open_set , (0 + heurestic[start] , start))

    g_score = {}
    for node in graph:
        g_score[node] = float("inf")
    g_score[start] = 0

    came_from = {}

    while open_set:
        current_f_score , current = heapq.heappop(open)
        if current == goal:
            path = []
            while current in came_from:
                path.append(current)
                current = came_from[current]
            path.append(start)
            return path[::-1]
        
        for neighbor , cost in graph[current].items():
            tentative_score = g_score[current] + cost

            if tentative_score < g_score[neighbor]:
                came_from[neighbor] = current
                g_score[neighbor] = tentative_score
                f_score = tentative_score + heurestic[neighbor]
                heapq.heappush(open_set , (f_score , neighbor))
    return None


