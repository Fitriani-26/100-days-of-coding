a = int(input("Masukkan angka pertama : "))
b = int(input("Mauskkan angka kedua : " ))
c = a * b
d = 0

if c % 2 == 0 and c - 3 != 0:
    d = c * 2
else :
    d = c + 2

print (d)