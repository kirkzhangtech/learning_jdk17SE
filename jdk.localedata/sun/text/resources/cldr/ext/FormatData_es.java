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

public class FormatData_es extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "enero",
               "febrero",
               "marzo",
               "abril",
               "mayo",
               "junio",
               "julio",
               "agosto",
               "septiembre",
               "octubre",
               "noviembre",
               "diciembre",
               "",
            };
        final String[] metaValue_MonthAbbreviations = new String[] {
               "ene",
               "feb",
               "mar",
               "abr",
               "may",
               "jun",
               "jul",
               "ago",
               "sept",
               "oct",
               "nov",
               "dic",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "E",
               "F",
               "M",
               "A",
               "M",
               "J",
               "J",
               "A",
               "S",
               "O",
               "N",
               "D",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "domingo",
               "lunes",
               "martes",
               "mi\u00e9rcoles",
               "jueves",
               "viernes",
               "s\u00e1bado",
            };
        final String[] metaValue_DayAbbreviations = new String[] {
               "dom",
               "lun",
               "mar",
               "mi\u00e9",
               "jue",
               "vie",
               "s\u00e1b",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "D",
               "L",
               "M",
               "X",
               "J",
               "V",
               "S",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "1.er trimestre",
               "2.\u00ba trimestre",
               "3.er trimestre",
               "4.\u00ba trimestre",
            };
        final String[] metaValue_QuarterAbbreviations = new String[] {
               "T1",
               "T2",
               "T3",
               "T4",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "a.\u00a0m.",
               "p.\u00a0m.",
               "",
               "del mediod\u00eda",
               "de la madrugada",
               "de la ma\u00f1ana",
               "",
               "",
               "de la tarde",
               "",
               "de la noche",
               "",
            };
        final String[] metaValue_Eras = new String[] {
               "a. C.",
               "d. C.",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "H:mm:ss (zzzz)",
               "H:mm:ss z",
               "H:mm:ss",
               "H:mm",
            };
        final String[] metaValue_buddhist_QuarterNarrows = new String[] {
               "1",
               "2",
               "3",
               "4",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "BE",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE, d 'de' MMMM 'de' y G",
               "d 'de' MMMM 'de' y G",
               "d/M/y G",
               "d/M/yy G",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE, d 'de' MMMM 'de' y GGGG",
               "d 'de' MMMM 'de' y GGGG",
               "d/M/y GGGG",
               "d/M/yy GGGG",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "antes de RDC",
               "minguo",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "AH",
            };
        final String metaValue_calendarname_gregorian = "calendario gregoriano";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "a\u00f1o" },
            { "calendarname.islamic-umalqura", "calendario isl\u00e1mico umalqura" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.japanese.DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y G",
                    "d 'de' MMMM 'de' y G",
                    "dd/MM/y G",
                    "dd/MM/yy GGGGG",
                }
            },
            { "standalone.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "calendario civil isl\u00e1mico" },
            { "islamic.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.regionFormat.standard", "horario est\u00e1ndar de {0}" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "calendarname.japanese", "calendario japon\u00e9s" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayAbbreviations },
            { "roc.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "antes de Cristo",
                    "despu\u00e9s de Cristo",
                }
            },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1}, {0}",
                    "{1}, {0}",
                    "{1} {0}",
                    "{1} {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_AmPmMarkers },
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
                    "EEEE, d 'de' MMMM 'de' y GGGG",
                    "d 'de' MMMM 'de' y GGGG",
                    "dd/MM/y GGGG",
                    "dd/MM/yy G",
                }
            },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "minuto" },
            { "field.era", "era" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "a.\u00a0m./p.\u00a0m." },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.MonthNames",
                new String[] {
                    "muharram",
                    "safar",
                    "rabi\u02bb I",
                    "rabi\u02bb II",
                    "jumada I",
                    "jumada II",
                    "rajab",
                    "sha\u02bbban",
                    "ramad\u00e1n",
                    "shawwal",
                    "dhu\u02bbl-qi\u02bbdah",
                    "dhu\u02bbl-hijjah",
                    "",
                }
            },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "calendarname.roc", "calendario de la Rep\u00fablica de China" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.month", "mes" },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.second", "segundo" },
            { "DayAbbreviations", metaValue_DayAbbreviations },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "calendario isl\u00e1mico" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "noon:12:00;night1:20:00-24:00;morning2:06:00-12:00;morning1:00:00-06:00;evening1:12:00-20:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthAbbreviations },
            { "timezone.regionFormat", "hora de {0}" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' 'mil other:0' 'mil}",
                    "{one:00' 'mil other:00' 'mil}",
                    "{one:000' 'mil other:000' 'mil}",
                    "{one:0' 'mill\u00f3n other:0' 'millones}",
                    "{one:00' 'millones other:00' 'millones}",
                    "{one:000' 'millones other:000' 'millones}",
                    "{one:0' 'mil' 'millones other:0' 'mil' 'millones}",
                    "{one:00' 'mil' 'millones other:00' 'mil' 'millones}",
                    "{one:000' 'mil' 'millones other:000' 'mil' 'millones}",
                    "{one:0' 'bill\u00f3n other:0' 'billones}",
                    "{one:00' 'billones other:00' 'billones}",
                    "{one:000' 'billones other:000' 'billones}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_AmPmMarkers },
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
            { "field.zone", "zona horaria" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterAbbreviations },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "d\u00eda de la semana" },
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
            { "field.week", "semana" },
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
                    "{one:0\u00a0mil other:0\u00a0mil}",
                    "{one:00\u00a0mil other:00\u00a0mil}",
                    "{one:000\u00a0mil other:000\u00a0mil}",
                    "{one:0\u00a0M other:0\u00a0M}",
                    "{one:00\u00a0M other:00\u00a0M}",
                    "{one:000\u00a0M other:000\u00a0M}",
                    "{one:0000\u00a0M other:0000\u00a0M}",
                    "{one:00\u00a0mil\u00a0M other:00\u00a0mil\u00a0M}",
                    "{one:000\u00a0mil\u00a0M other:000\u00a0mil\u00a0M}",
                    "{one:0\u00a0B other:0\u00a0B}",
                    "{one:00\u00a0B other:00\u00a0B}",
                    "{one:000\u00a0B other:000\u00a0B}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "timezone.regionFormat.daylight", "horario de verano de {0}" },
            { "DatePatterns",
                new String[] {
                    "EEEE, d 'de' MMMM 'de' y",
                    "d 'de' MMMM 'de' y",
                    "d MMM y",
                    "d/M/yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayAbbreviations },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthAbbreviations },
            { "standalone.DayNames", metaValue_DayNames },
            { "PluralRules", "one:n = 1" },
            { "field.hour", "hora" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "muh.",
                    "saf.",
                    "rab. I",
                    "rab. II",
                    "jum. I",
                    "jum. II",
                    "raj.",
                    "sha.",
                    "ram.",
                    "shaw.",
                    "dhu\u02bbl-q.",
                    "dhu\u02bbl-h.",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "calendario budista" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0\u00a0%",
                    "#,##0.00\u00a0\u00a4",
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
