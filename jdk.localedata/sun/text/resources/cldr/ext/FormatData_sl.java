/*
 * Copyright (c) 2012, 2024, Oracle and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact Oracle, 500 Oracle Parkway, Redwood Shores, CA 94065 USA
 * or visit www.oracle.com if you need additional information or have any
 * questions.
 */

/*
 * COPYRIGHT AND PERMISSION NOTICE
 *
 * Copyright (c) 1991-2020 Unicode, Inc. All rights reserved.
 * Distributed under the Terms of Use in https://www.unicode.org/copyright.html.
 *
 * Permission is hereby granted, free of charge, to any person obtaining
 * a copy of the Unicode data files and any associated documentation
 * (the "Data Files") or Unicode software and any associated documentation
 * (the "Software") to deal in the Data Files or Software
 * without restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, and/or sell copies of
 * the Data Files or Software, and to permit persons to whom the Data Files
 * or Software are furnished to do so, provided that either
 * (a) this copyright and permission notice appear with all copies
 * of the Data Files or Software, or
 * (b) this copyright and permission notice appear in associated
 * Documentation.
 *
 * THE DATA FILES AND SOFTWARE ARE PROVIDED "AS IS", WITHOUT WARRANTY OF
 * ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE
 * WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT OF THIRD PARTY RIGHTS.
 * IN NO EVENT SHALL THE COPYRIGHT HOLDER OR HOLDERS INCLUDED IN THIS
 * NOTICE BE LIABLE FOR ANY CLAIM, OR ANY SPECIAL INDIRECT OR CONSEQUENTIAL
 * DAMAGES, OR ANY DAMAGES WHATSOEVER RESULTING FROM LOSS OF USE,
 * DATA OR PROFITS, WHETHER IN AN ACTION OF CONTRACT, NEGLIGENCE OR OTHER
 * TORTIOUS ACTION, ARISING OUT OF OR IN CONNECTION WITH THE USE OR
 * PERFORMANCE OF THE DATA FILES OR SOFTWARE.
 *
 * Except as contained in this notice, the name of a copyright holder
 * shall not be used in advertising or otherwise to promote the sale,
 * use or other dealings in these Data Files or Software without prior
 * written authorization of the copyright holder.
 */

package sun.text.resources.cldr.ext;

import java.util.ListResourceBundle;

public class FormatData_sl extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "januar",
               "februar",
               "marec",
               "april",
               "maj",
               "junij",
               "julij",
               "avgust",
               "september",
               "oktober",
               "november",
               "december",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "jan.",
               "feb.",
               "mar.",
               "apr.",
               "maj",
               "jun.",
               "jul.",
               "avg.",
               "sep.",
               "okt.",
               "nov.",
               "dec.",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "j",
               "f",
               "m",
               "a",
               "m",
               "j",
               "j",
               "a",
               "s",
               "o",
               "n",
               "d",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "nedelja",
               "ponedeljek",
               "torek",
               "sreda",
               "\u010detrtek",
               "petek",
               "sobota",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "ned.",
               "pon.",
               "tor.",
               "sre.",
               "\u010det.",
               "pet.",
               "sob.",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "n",
               "p",
               "t",
               "s",
               "\u010d",
               "p",
               "s",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "1. \u010detrtletje",
               "2. \u010detrtletje",
               "3. \u010detrtletje",
               "4. \u010detrtletje",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "1. \u010det.",
               "2. \u010det.",
               "3. \u010det.",
               "4. \u010det.",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "dop.",
               "pop.",
               "opolno\u010di",
               "opoldne",
               "zjutraj",
               "dopoldan",
               "popoldan",
               "",
               "zve\u010der",
               "",
               "pono\u010di",
               "",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "d",
               "p",
               "24.00",
               "12.00",
               "zj",
               "d",
               "p",
               "",
               "zv",
               "",
               "po",
               "",
            };
        final String[] metaValue_abbreviated_AmPmMarkers = new String[] {
               "dop.",
               "pop.",
               "opoln.",
               "opold.",
               "zjut.",
               "dop.",
               "pop.",
               "",
               "zve\u010d.",
               "",
               "pono\u010di",
               "",
            };
        final String[] metaValue_Eras = new String[] {
               "pr. Kr.",
               "po Kr.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "HH:mm:ss zzzz",
               "HH:mm:ss z",
               "HH:mm:ss",
               "HH:mm",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "budisti\u010dni koledar",
            };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
               "BC",
               "bud. kol.",
            };
        final String[] metaValue_java_time_buddhist_narrow_Eras = new String[] {
               "BC",
               "BK",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE, dd. MMMM y G",
               "dd. MMMM y G",
               "d. MMM y G",
               "d. MM. yy GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE, dd. MMMM y GGGG",
               "dd. MMMM y GGGG",
               "d. MMM y GGGG",
               "d. MM. yy G",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "pred RK",
               "Minguo koledar",
            };
        final String metaValue_calendarname_gregorian = "gregorijanski koledar";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "leto" },
            { "calendarname.islamic-umalqura", "islamski koledar Umm al-Qura" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "islamski civilni koledar" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "timezone.regionFormat.standard", "{0} standardni \u010das" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "japonski koledar" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "long.Eras",
                new String[] {
                    "pred Kristusom",
                    "po Kristusu",
                }
            },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ",",
                    ".",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u2212",
                    "e",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "minuta" },
            { "field.era", "doba" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "dop/pop" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "calendarname.roc", "koledar Minguo" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "field.month", "mesec" },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.second", "sekunda" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "islamski koledar" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:22:00-06:00;morning2:10:00-12:00;afternoon1:12:00-18:00;morning1:06:00-10:00;evening1:18:00-22:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "{0} \u010das" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'tiso\u010d two:0' 'tiso\u010d few:0' 'tiso\u010d other:0' 'tiso\u010d}",
                    "{one:00' 'tiso\u010d two:00' 'tiso\u010d few:00' 'tiso\u010d other:00' 'tiso\u010d}",
                    "{one:000' 'tiso\u010d two:000' 'tiso\u010d few:000' 'tiso\u010d other:000' 'tiso\u010d}",
                    "{one:0' 'milijon two:0' 'milijona few:0' 'milijone other:0' 'milijonov}",
                    "{one:00' 'milijon two:00' 'milijona few:00' 'milijoni other:00' 'milijonov}",
                    "{one:000' 'milijon two:000' 'milijona few:000' 'milijoni other:000' 'milijonov}",
                    "{one:0' 'milijarda two:0' 'milijardi few:0' 'milijarde other:0' 'milijard}",
                    "{one:00' 'milijarda two:00' 'milijardi few:00' 'milijarde other:00' 'milijard}",
                    "{one:000' 'milijarda two:000' 'milijardi few:000' 'milijarde other:000' 'milijard}",
                    "{one:0' 'bilijon two:0' 'bilijona few:0' 'bilijoni other:0' 'bilijonov}",
                    "{one:00' 'bilijon two:00' 'bilijona few:00' 'bilijoni other:00' 'bilijonov}",
                    "{one:000' 'bilijon two:000' 'bilijona few:000' 'bilijoni other:000' 'bilijonov}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.DayAbbreviations", metaValue_DayAbbreviations },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.zone", "\u010dasovni pas" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "dan v tednu" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "timezone.hourFormat", "+HH.mm;-HH.mm" },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "field.week", "teden" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0tis'.' two:0\u00a0tis'.' few:0\u00a0tis'.' other:0\u00a0tis'.'}",
                    "{one:00\u00a0tis'.' two:00\u00a0tis'.' few:00\u00a0tis'.' other:00\u00a0tis'.'}",
                    "{one:000\u00a0tis'.' two:000\u00a0tis'.' few:000\u00a0tis'.' other:000\u00a0tis'.'}",
                    "{one:0\u00a0mio'.' two:0\u00a0mio'.' few:0\u00a0mio'.' other:0\u00a0mio'.'}",
                    "{one:00\u00a0mio'.' two:00\u00a0mio'.' few:00\u00a0mio'.' other:00\u00a0mio'.'}",
                    "{one:000\u00a0mio'.' two:000\u00a0mio'.' few:000\u00a0mio'.' other:000\u00a0mio'.'}",
                    "{one:0\u00a0mrd'.' two:0\u00a0mrd'.' few:0\u00a0mrd'.' other:0\u00a0mrd'.'}",
                    "{one:00\u00a0mrd'.' two:00\u00a0mrd'.' few:00\u00a0mrd'.' other:00\u00a0mrd'.'}",
                    "{one:000\u00a0mrd'.' two:000\u00a0mrd'.' few:000\u00a0mrd'.' other:000\u00a0mrd'.'}",
                    "{one:0\u00a0bil'.' two:0\u00a0bil'.' few:0\u00a0bil'.' other:0\u00a0bil'.'}",
                    "{one:00\u00a0bil'.' two:00\u00a0bil'.' few:00\u00a0bil'.' other:00\u00a0bil'.'}",
                    "{one:000\u00a0bil'.' two:000\u00a0bil'.' few:000\u00a0bil'.' other:000\u00a0bil'.'}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_narrow_Eras },
            { "timezone.regionFormat.daylight", "{0} poletni \u010das" },
            { "DatePatterns",
                new String[] {
                    "EEEE, dd. MMMM y",
                    "dd. MMMM y",
                    "d. MMM y",
                    "d. MM. yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "PluralRules", "one:v = 0 and i % 100 = 1;few:v = 0 and i % 100 = 3..4 or v != 0;two:v = 0 and i % 100 = 2" },
            { "field.hour", "ura" },
            { "calendarname.buddhist", "budisti\u010dni koledar" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "#,##0.00\u00a0\u00a4;(#,##0.00\u00a0\u00a4)",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
