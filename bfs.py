from collections import deque

# def bfs(graph, start):
#     visited = set()
#     queue = deque([start])
#     visited.add(start)

#     while queue:
#         vertex = queue.popleft()
#         print(vertex, end=" ")

#         for neighbor in graph[vertex]:
#             if neighbor not in visited:
#                 visited.add(neighbor)
#                 queue.append(neighbor)


def bfs(graph , start):
    visited = []
    queue = []
    queue.append(start)
    visited.append(start)
    while queue:
        node = queue.pop(0)
        print(node , end=" ")
        for i in graph[node]:
            if i not in visited:
                visited.append(i)
                queue.append(i)

# Example usage:
graph = {
    'A': ['B', 'C'],
    'B': ['A', 'D', 'E'],
    'C': ['A', 'F'],
    'D': ['B'],
    'E': ['B', 'F'],
    'F': ['C', 'E']
}

bfs(graph, 'A')