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

public class FormatData_tr extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "Ocak",
               "\u015eubat",
               "Mart",
               "Nisan",
               "May\u0131s",
               "Haziran",
               "Temmuz",
               "A\u011fustos",
               "Eyl\u00fcl",
               "Ekim",
               "Kas\u0131m",
               "Aral\u0131k",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "Oca",
               "\u015eub",
               "Mar",
               "Nis",
               "May",
               "Haz",
               "Tem",
               "A\u011fu",
               "Eyl",
               "Eki",
               "Kas",
               "Ara",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "O",
               "\u015e",
               "M",
               "N",
               "M",
               "H",
               "T",
               "A",
               "E",
               "E",
               "K",
               "A",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "Pazar",
               "Pazartesi",
               "Sal\u0131",
               "\u00c7ar\u015famba",
               "Per\u015fembe",
               "Cuma",
               "Cumartesi",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "Paz",
               "Pzt",
               "Sal",
               "\u00c7ar",
               "Per",
               "Cum",
               "Cmt",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "P",
               "P",
               "S",
               "\u00c7",
               "P",
               "C",
               "C",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "1. \u00e7eyrek",
               "2. \u00e7eyrek",
               "3. \u00e7eyrek",
               "4. \u00e7eyrek",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "\u00c71",
               "\u00c72",
               "\u00c73",
               "\u00c74",
            };
        final String[] metaValue_QuarterNarrows = new String[] {
               "1.",
               "2.",
               "3.",
               "4.",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "\u00d6\u00d6",
               "\u00d6S",
               "gece yar\u0131s\u0131",
               "\u00f6\u011fle",
               "sabah",
               "\u00f6\u011fleden \u00f6nce",
               "\u00f6\u011fleden sonra",
               "ak\u015fam\u00fcst\u00fc",
               "ak\u015fam",
               "",
               "gece",
               "",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "\u00f6\u00f6",
               "\u00f6s",
               "gece",
               "\u00f6",
               "sabah",
               "\u00f6\u011fleden \u00f6nce",
               "\u00f6\u011fleden sonra",
               "ak\u015fam\u00fcst\u00fc",
               "ak\u015fam",
               "",
               "gece",
               "",
            };
        final String[] metaValue_Eras = new String[] {
               "M\u00d6",
               "MS",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "HH:mm:ss zzzz",
               "HH:mm:ss z",
               "HH:mm:ss",
               "HH:mm",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "BE",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "G d MMMM y EEEE",
               "G d MMMM y",
               "G d MMM y",
               "GGGGG d.MM.y",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "GGGG d MMMM y EEEE",
               "GGGG d MMMM y",
               "GGGG d MMM y",
               "G d.MM.y",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "R.O.C. \u00d6ncesi",
               "Minguo",
            };
        final String[] metaValue_java_time_roc_Eras = new String[] {
               "Before R.O.C.",
               "Minguo",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "Hicri",
            };
        final String metaValue_calendarname_gregorian = "Miladi Takvim";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "y\u0131l" },
            { "calendarname.islamic-umalqura", "Hicri Takvim (\u00dcmm\u00fc-l Kurra Takvimi)" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "d MMMM y G EEEE",
                    "d MMMM y G",
                    "d MMM y G",
                    "d.MM.y G",
                }
            },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "Arap Takvimi" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.regionFormat.standard", "{0} Standart Saati" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "Japon Takvimi" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "Milattan \u00d6nce",
                    "Milattan Sonra",
                }
            },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
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
                    "-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns",
                new String[] {
                    "d MMMM y GGGG EEEE",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "d.MM.y GGGG",
                }
            },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "dakika" },
            { "field.era", "\u00e7a\u011f" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "\u00d6\u00d6/\u00d6S" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.MonthNames",
                new String[] {
                    "Muharrem",
                    "Safer",
                    "Rebi\u00fclevvel",
                    "Rebi\u00fclahir",
                    "Cemaziyelevvel",
                    "Cemaziyelahir",
                    "Recep",
                    "\u015eaban",
                    "Ramazan",
                    "\u015eevval",
                    "Zilkade",
                    "Zilhicce",
                    "",
                }
            },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "calendarname.roc", "\u00c7in Cumhuriyeti Takvimi" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.month", "ay" },
            { "roc.Eras", metaValue_java_time_roc_Eras },
            { "field.second", "saniye" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "Hicri Takvim" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "midnight:00:00;noon:12:00;night1:21:00-06:00;morning2:11:00-12:00;afternoon1:12:00-18:00;morning1:06:00-11:00;afternoon2:18:00-19:00;evening1:19:00-21:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "{0} Saati" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'bin other:0' 'bin}",
                    "{one:00' 'bin other:00' 'bin}",
                    "{one:000' 'bin other:000' 'bin}",
                    "{one:0' 'milyon other:0' 'milyon}",
                    "{one:00' 'milyon other:00' 'milyon}",
                    "{one:000' 'milyon other:000' 'milyon}",
                    "{one:0' 'milyar other:0' 'milyar}",
                    "{one:00' 'milyar other:00' 'milyar}",
                    "{one:000' 'milyar other:000' 'milyar}",
                    "{one:0' 'trilyon other:0' 'trilyon}",
                    "{one:00' 'trilyon other:00' 'trilyon}",
                    "{one:000' 'trilyon other:000' 'trilyon}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
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
            { "java.time.roc.Eras", metaValue_java_time_roc_Eras },
            { "field.zone", "saat dilimi" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_java_time_roc_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "haftan\u0131n g\u00fcn\u00fc" },
            { "japanese.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "islamic.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "field.week", "hafta" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.DayNarrows", metaValue_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0B other:0\u00a0B}",
                    "{one:00\u00a0B other:00\u00a0B}",
                    "{one:000\u00a0B other:000\u00a0B}",
                    "{one:0\u00a0Mn other:0\u00a0Mn}",
                    "{one:00\u00a0Mn other:00\u00a0Mn}",
                    "{one:000\u00a0Mn other:000\u00a0Mn}",
                    "{one:0\u00a0Mr other:0\u00a0Mr}",
                    "{one:00\u00a0Mr other:00\u00a0Mr}",
                    "{one:000\u00a0Mr other:000\u00a0Mr}",
                    "{one:0\u00a0Tn other:0\u00a0Tn}",
                    "{one:00\u00a0Tn other:00\u00a0Tn}",
                    "{one:000\u00a0Tn other:000\u00a0Tn}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "timezone.regionFormat.daylight", "{0} Yaz Saati" },
            { "DatePatterns",
                new String[] {
                    "d MMMM y EEEE",
                    "d MMMM y",
                    "d MMM y",
                    "d.MM.y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "PluralRules", "one:n = 1" },
            { "field.hour", "saat" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "Muhar.",
                    "Safer",
                    "R.evvel",
                    "R.ahir",
                    "C.evvel",
                    "C.ahir",
                    "Recep",
                    "\u015eaban",
                    "Ram.",
                    "\u015eevval",
                    "Zilkade",
                    "Zilhicce",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "Budist Takvimi" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "%#,##0",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
