angka = []
jumlah = 0
panjang = int (input("Masukkan panjang indeks : "))

for a in range (panjang):
    bil = int(input("Masukkan Angka pada indeks "))
    angka.append(bil)
    jumlah += bil
print (jumlah)