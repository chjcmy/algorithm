def draw_star(n):
    if n == 1:
        return ['*']
    stars = draw_star(n // 3)
    l = []
    for s in stars:
        l.append(s * 3)
    for s in stars:
        l.append(s + ' ' * (n // 3) + s)
    for s in stars:
        l.append(s * 3)
    return l

def main():
    n = int(input().strip())
    print('\n'.join(draw_star(n)))

if __name__ == "__main__":
    main()
