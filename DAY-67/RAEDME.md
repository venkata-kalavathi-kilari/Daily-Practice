# Queue Using Linked List

## Problem
Implement a **Queue** using a singly linked list.

A queue follows the **FIFO (First In, First Out)** principle. The element inserted first is removed first.

The queue supports:
- `enqueue()` – Add an element to the rear.
- `dequeue()` – Remove an element from the front.
- `getFront()` – Get the front element.
- `isEmpty()` – Check whether the queue is empty.
- `size()` – Get the number of elements.

## Algorithm

### Enqueue
1. Create a new node.
2. If the queue is empty:
   - Set both `front` and `rear` to the new node.
3. Otherwise:
   - Connect the new node after `rear`.
   - Move `rear` to the new node.
4. Increase `currSize`.

### Dequeue
1. Check if the queue is empty.
2. If empty, return.
3. Move `front` to `front.next`.
4. If `front` becomes `null`, set `rear` to `null`.
5. Decrease `currSize`.

### Get Front
- If the queue is empty, return `-1`.
- Otherwise, return `front.data`.

## Example

### Operations

```text
enqueue(10)
enqueue(20)
enqueue(30)
getFront()
dequeue()
getFront()
size()
```
### Output
10
20
2

## Time Complexity

| Operation | Complexity |
|---|---|
| `enqueue()` | O(1) |
| `dequeue()` | O(1) |
| `getFront()` | O(1) |
| `isEmpty()` | O(1) |
| `size()` | O(1) |

## Space Complexity

- **O(n)** – The queue stores `n` nodes.
