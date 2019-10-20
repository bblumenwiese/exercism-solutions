class Year {
    public let year: Int
    public let isLeapYear: Bool
    
    public init(calendarYear: Int) {
        self.year = calendarYear
        self.isLeapYear = checkIsLeapYear(year: calendarYear)
    }
}

fileprivate func checkIsLeapYear(year: Int) -> Bool {
    if (year % 400 == 0) {
        return true
    } else if (year % 100 == 0) {
        return false
    } else if (year % 4 == 0) {
        return true
    }
    return false
}
