    public double angleClock(int hour, int minutes) {
        final double MINUTES_PRE_HOUR = 60;
        final double DEG_PER_MIN = 360 / MINUTES_PRE_HOUR;
        final double DEG_PER_HOUR = 360 / 12;
        
        double angleOfMinutes = minutes * DEG_PER_MIN;
        double angleOfHour = hour * DEG_PER_HOUR + ((minutes/MINUTES_PRE_HOUR)* DEG_PER_HOUR);
        double diff = Math.abs(angleOfMinutes - angleOfHour);
        
        if  ( diff > 180 ) { diff = 360 - diff; }

        return diff;
    }