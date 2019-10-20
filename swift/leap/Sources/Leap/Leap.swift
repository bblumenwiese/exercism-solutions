class Year {
    let year: Int
    
    var isLeapYear: Bool {
        if (year % 400 == 0) {
            return true
        } else if (year % 100 == 0) {
            return false
        } else if (year % 4 == 0) {
            return true
        } else {
            return false
        }
    }
    
    init(calendarYear: Int) {
        self.year = calendarYear
    }
}
