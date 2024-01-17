while True :
    print ("""Selamat Datang di Toko Kami
Silahkan Pilih Menu dibawah ini :
a. Bakso = Rp 10.000
b. Nasi Goreng = Rp 12.0000
c. Nasi Kuning = Rp 7.000
d. Mie Ayam = Rp 12.000""")
    print ("Ketik selesai untuk berhenti")
    perintah = input("Masukkan pesanan Anda = ")
    if perintah == "a" :
        jumlah_pesanan = int(input("Masukkan jumlah pesanan :"))
        jumlah = 10000 * jumlah_pesanan
        bayar = int(input("Uang Anda :Rp."))
        if jumlah > bayar :
            hutang =  jumlah - bayar
            print ("Total Bayar = Rp.",jumlah)
            print ("Maaf uang Anda tidak cukup")
            print ("Anda berhutang sebesar Rp.",hutang,"\n")
        else :
            kembalian = bayar - jumlah
            print ("Total Bayar = Rp.",jumlah)
            print ("Kembalian = Rp.",kembalian)
            print("selamat menikmati \n")
            
    elif perintah == "b" :
        jumlah_pesanan = int(input("Masukkan jumlah pesanan :"))
        jumlah = 12000 * jumlah_pesanan
        bayar = int(input("Uang Anda : Rp."))
        if jumlah > bayar :
            hutang =  jumlah - bayar
            print ("Total Bayar = Rp.",jumlah)
            print ("Maaf uang Anda tidak cukup")
            print ("Anda berhutang sebesar Rp.",hutang,"\n")
        else :
            kembalian = bayar - jumlah
            print ("Total Bayar = Rp.",jumlah)
            print ("Kembalian = Rp.",kembalian)
            print("selamat menikmati \n")
            
    elif perintah == "c":
        jumlah_pesanan = int(input("Masukkan jumlah pesanan :"))
        jumlah = 7000 * jumlah_pesanan
        bayar = int(input("Uang Anda : Rp. "))
        if jumlah > bayar :
            hutang =  jumlah - bayar
            print ("Total Bayar = Rp.",jumlah)
            print ("Maaf uang Anda tidak cukup")
            print ("Anda berhutang sebesar Rp.",hutang,"\n")
        else :
            kembalian = bayar - jumlah
            print ("Total Bayar = Rp.",jumlah)
            print ("Kembalian = Rp.",kembalian)
            print("selamat menikmati \n")
            
    elif perintah == "d":
        jumlah_pesanan = int(input("Masukkan jumlah pesanan :"))
        jumlah = 12000 * jumlah_pesanan
        bayar = int(input("Uang Anda : Rp."))
        if jumlah > bayar :
            hutang =  jumlah - bayar
            print ("Total Bayar = Rp.",jumlah)
            print ("Maaf uang Anda tidak cukup")
            print ("Anda berhutang sebesar Rp.",hutang,"\n")
        else :
            kembalian = bayar - jumlah
            print ("Total Bayar = Rp.",jumlah)
            print ("Kembalian = Rp.",kembalian)
            print("selamat menikmati \n")

    elif perintah == "selesai" :
        print ("Terima Kasih Telah Mengunjungi Toko Kami")
        break
        
    else :
        print ("Inputan Anda Salah, Silahkan pilih sesuai perintah \n")
         

        

    
