import heapq

def ucs(graph, start, goal):
    # Priority queue to store (cost, node, path)
    queue = [(0, start, [])]
    visited = set()

    while queue:
        cost, node, path = heapq.heappop(queue)
        
        if node in visited:
            continue
        
        path = path + [node]
        visited.add(node)

        if node == goal:
            return cost, path

        for neighbor, weight in graph.get(node, []):
            if neighbor not in visited:
                heapq.heappush(queue, (cost + weight, neighbor, path))

    return float("inf"), []

# Example usage
if __name__ == "__main__":
    graph = {
        'A': [('B', 1), ('C', 4)],
        'B': [('A', 1), ('C', 2), ('D', 5)],
        'C': [('A', 4), ('B', 2), ('D', 1)],
        'D': [('B', 5), ('C', 1)]
    }
    start = 'A'
    goal = 'D'
    cost, path = ucs(graph, start, goal)
    print(f"Cost: {cost}, Path: {path}")