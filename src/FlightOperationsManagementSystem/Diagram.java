package FlightOperationsManagementSystem;

public class Diagram {
}

/*
classDiagram

class Havayolu {
  - kimlik: string
  - uçaklar: Set<Uçak>
}

class Uçak {
  - kimlik: string
  - tip: string
  - çalışır: boolean
}

class Uçuş {
  - kimlik: string
  - kalkışHavaalanı: Havaalanı
  - inişHavaalanı: Havaalanı
  - kalkışSaati: LocalDateTime
  - inişSaati: LocalDateTime
  - pilot: Pilot
  - yardımcıPilot: Pilot
}

class Havaalanı {
  - kimlik: string
  - isim: string
}

class Pilot {
  - kimlik: string
  - deneyimDüzeyi: int
}

Havayolu "1" -- "*" Uçak : uçaklara sahiptir
Uçak "1" -- "1" Uçuş : uçuş gerçekleştirir
Uçuş "1" -- "1" Havaalanı : kalkış için
Uçuş "1" -- "1" Havaalanı : iniş için
Uçuş "1" -- "1" Pilot : pilot
Uçuş "1" -- "1" Pilot : yardımcı pilot
Havayolu "1" -- "*" Pilot : pilotlara sahiptir

 */