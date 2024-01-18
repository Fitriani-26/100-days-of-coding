angka = int(input("Masukkan angka  :"))
ganjil = 0
genap = 0

for a in range (1,angka+1):
    if ( a % 2 == 0):
        genap += a
    else :
        ganjil += a
print(ganjil)
print(genap)