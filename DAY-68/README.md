# Stack Using Linked List

## Problem
Implement a **Stack** using a singly linked list.

A stack follows the **LIFO (Last In, First Out)** principle. The element inserted last is removed first.

The stack supports:
- `push()` – Add an element to the stack.
- `pop()` – Remove the top element.
- `peek()` – Return the top element.
- `isEmpty()` – Check whether the stack is empty.
- `size()` – Return the number of elements.

## Algorithm

### Push
1. Create a new node.
2. Set the new node's `next` to `top`.
3. Make the new node the `top`.
4. Increase `count`.

### Pop
1. Check if the stack is empty.
2. If empty, return.
3. Move `top` to `top.next`.
4. Decrease `count`.

### Peek
- If the stack is empty, return `-1`.
- Otherwise, return `top.data`.

## Example

### Operations

```text
push(10)
push(20)
push(30)
peek()
pop()
peek()
size()
```

### Stack

After pushing:

```text
Top
 ↓
30
 ↓
20
 ↓
10
 ↓
null
```

`peek()` returns:

```text
30
```

After `pop()`:

```text
Top
 ↓
20
 ↓
10
 ↓
null
```

`peek()` now returns:

```text
20
```

`size()` returns:

```text
2
```

## LIFO Principle

```text
Push: 10 → 20 → 30

Top
 ↓
30
 ↓
20
 ↓
10

Pop removes 30 first.
```

**LIFO = Last In, First Out**

## Time Complexity

| Operation | Complexity |
|---|---|
| `push()` | O(1) |
| `pop()` | O(1) |
| `peek()` | O(1) |
| `isEmpty()` | O(1) |
| `size()` | O(1) |

## Space Complexity

- **O(n)** – The stack stores `n` nodes.
