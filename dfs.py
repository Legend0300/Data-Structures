# Depth-First Search (DFS) implementation in Python

def dfs(graph, start, visited=None):
    if visited is None:
        visited = set()
    visited.add(start)
    
    print(start)  # Process the node (e.g., print it)
    
    for neighbor in graph[start]:
        if neighbor not in visited:
            dfs(graph, neighbor, visited)
    
    return visited
# visited = []
# def dfs(graph , start):
#     visited.append(start)
#     print(start , end= " ")
#     for i in graph[start]:
#         if i not in visited:
#             visited.append(i)
#             dfs(graph , i)

# Example usage:
graph = {
    'A': ['B', 'C'],
    'B': ['D', 'E'],
    'C': ['F'],
    'D': [],
    'E': ['F'],
    'F': []
}

dfs(graph, 'A')