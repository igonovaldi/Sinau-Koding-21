CREATE database toko_db;
USE toko_db;
CREATE TABLE barang(
id_barang int NOT NULL,
nama_barang varchar(100) NOT NULL,
harga double NOT NULL,
stok int NOT NULL,
id_supplier int NOT NULL,
PRIMARY KEY(id_barang)
);
CREATE TABLE supplier(
id_supplier int NOT NULL,
nama_supplier varchar(100) NOT NULL,
no_telp varchar(20),
alamat varchar(255),
PRIMARY KEY(id_supplier)
);
CREATE TABLE pembayaran(
id_pembayaran int NOT NULL,
tgl_bayar datetime NOT NULL,
total double NOT NULL,
id_transaksi int NOT NULL,
PRIMARY KEY(id_pembayaran)
);
CREATE TABLE pembeli(
id_pembeli int NOT NULL,
nama_pembeli varchar(255) NOT NULL,
no_telp varchar(20),
alamat varchar(255),
PRIMARY KEY(id_pembeli)
);
CREATE TABLE transaksi(
id_transaksi int NOT NULL,
id_barang int NOT NULL,
id_pembeli int NOT NULL,
tgl_transaksi datetime NOT NULL,
keterangan varchar(255),
PRIMARY KEY (id_transaksi)
);

ALTER TABLE barang
ADD FOREIGN KEY (id_supplier) REFERENCES supplier (id_supplier);
ALTER TABLE pembayaran
ADD FOREIGN KEY (id_transaksi) REFERENCES transaksi (id_transaksi);
ALTER TABLE transaksi
ADD FOREIGN KEY (id_barang) REFERENCES barang (id_barang),
ADD FOREIGN KEY (id_pembeli) REFERENCES pembeli (id_pembeli);