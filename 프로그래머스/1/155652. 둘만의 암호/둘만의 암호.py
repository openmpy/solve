def solution(s, skip, index):
    a_to_z = [
        'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
        'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    ]
    
    for c in skip:
        if c in a_to_z:
            a_to_z.remove(c)
    
    answer = ''
    for c in s:
        answer += a_to_z[(a_to_z.index(c) + index) % len(a_to_z)]
    
    return answer