package MovieStore;

public class Diagram {
}



class Film {
//  - kimlik: string
//  - başlık: string
//  - açıklama: string
//  - tür: string
//  - yönetmen: string
//  - oyuncular: string[]
//  - fiyat: float
//  - stok: int
}

class Kullanıcı {
//  - kimlik: string
//  - ad: string
//  - soyad: string
//  - e-posta: string
//  - şifre: string
//  - kredi: int
}

class Abonelik {
//  - kimlik: string
//  - kullanıcı: Kullanıcı
//  - başlangıçTarihi: LocalDateTime
//  - bitişTarihi: LocalDateTime
//  - kredi: int
}

class Kiralama {
//  - kimlik: string
//  - kullanıcı: Kullanıcı
//  - film: Film
//  - başlangıçTarihi: LocalDateTime
//  - bitişTarihi: LocalDateTime
}

class Talep {
//  - kimlik: string
//  - kullanıcı: Kullanıcı
//  - film: Film
}

//         Film "1" -- "*" Kategori : kategorilere aittir
//        Film "1" -- "*" Yönetmen : yönetmen tarafından çekilmiştir
//        Film "1" -- "*" Oyuncu : oyuncular tarafından oynanmıştır
//        Kullanıcı "1" -- "*" Abonelik : aboneliğe sahiptir
//        Kullanıcı "1" -- "*" Kiralama : kiralama yapabilir
//        Kullanıcı "1" -- "*" Talep : talep edebilir
