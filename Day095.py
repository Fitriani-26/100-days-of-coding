angka = []

for a in range(1,10):
    data = int (input("Masukkan data : "))
    angka.append(data)
    print(angka)
# Mengakses Indeks
print("Data pada indeks ke-1 : ",angka[0])
print("Data pada indeks ke-7 : ",angka[6])
print("Data pada indeks ke-10 : ",angka[-1])

# Update nilai
angka[2] = 9
print("Data setelah di Update",angka)

# hapus
angka.remove(4)
angka.remove(8)
print("Data setelah di Hapus",angka)


