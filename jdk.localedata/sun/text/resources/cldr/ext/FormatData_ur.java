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

public class FormatData_ur extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u062c\u0646\u0648\u0631\u06cc",
               "\u0641\u0631\u0648\u0631\u06cc",
               "\u0645\u0627\u0631\u0686",
               "\u0627\u067e\u0631\u06cc\u0644",
               "\u0645\u0626\u06cc",
               "\u062c\u0648\u0646",
               "\u062c\u0648\u0644\u0627\u0626\u06cc",
               "\u0627\u06af\u0633\u062a",
               "\u0633\u062a\u0645\u0628\u0631",
               "\u0627\u06a9\u062a\u0648\u0628\u0631",
               "\u0646\u0648\u0645\u0628\u0631",
               "\u062f\u0633\u0645\u0628\u0631",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "J",
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
               "\u0627\u062a\u0648\u0627\u0631",
               "\u067e\u06cc\u0631",
               "\u0645\u0646\u06af\u0644",
               "\u0628\u062f\u06be",
               "\u062c\u0645\u0639\u0631\u0627\u062a",
               "\u062c\u0645\u0639\u06c1",
               "\u06c1\u0641\u062a\u06c1",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u067e\u06c1\u0644\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
               "\u062f\u0648\u0633\u0631\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
               "\u062a\u06cc\u0633\u0631\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
               "\u0686\u0648\u062a\u0647\u06cc \u0633\u06c1 \u0645\u0627\u06c1\u06cc",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u0622\u062f\u06be\u06cc \u0631\u0627\u062a",
               "",
               "\u0635\u0628\u062d \u0645\u06cc\u06ba",
               "",
               "\u062f\u0648\u067e\u06c1\u0631 \u0645\u06cc\u06ba",
               "\u0633\u06c1 \u067e\u06c1\u0631",
               "\u0634\u0627\u0645 \u0645\u06cc\u06ba",
               "",
               "\u0631\u0627\u062a \u0645\u06cc\u06ba",
               "",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "a",
               "p",
               "\u0622\u062f\u06be\u06cc \u0631\u0627\u062a",
               "",
               "\u0635\u0628\u062d",
               "",
               "\u062f\u0648\u067e\u06c1\u0631",
               "\u0633\u06c1 \u067e\u06c1\u0631",
               "\u0634\u0627\u0645",
               "",
               "\u0631\u0627\u062a",
               "",
            };
        final String[] metaValue_abbreviated_AmPmMarkers = new String[] {
               "AM",
               "PM",
               "\u0622\u062f\u06be\u06cc \u0631\u0627\u062a",
               "",
               "\u0635\u0628\u062d",
               "",
               "\u062f\u0648\u067e\u06c1\u0631",
               "\u0633\u06c1 \u067e\u06c1\u0631",
               "\u0634\u0627\u0645",
               "",
               "\u0631\u0627\u062a",
               "",
            };
        final String[] metaValue_long_Eras = new String[] {
               "\u0642\u0628\u0644 \u0645\u0633\u06cc\u062d",
               "\u0639\u06cc\u0633\u0648\u06cc",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "h:mm:ss a zzzz",
               "h:mm:ss a z",
               "h:mm:ss a",
               "h:mm a",
            };
        final String[] metaValue_buddhist_DayNarrows = new String[] {
               "S",
               "M",
               "T",
               "W",
               "T",
               "F",
               "S",
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
               "EEEE\u060c d MMMM\u060c y G",
               "d MMMM\u060c y G",
               "d MMM\u060c y G",
               "d/M/y GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE\u060c d MMMM\u060c y GGGG",
               "d MMMM\u060c y GGGG",
               "d MMM\u060c y GGGG",
               "d/M/y G",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "\u0642\u0628\u0644 \u0627\u0632 \u062c\u0645\u06c1\u0648\u0631\u06cc\u06c1 \u0686\u06cc\u0646",
               "\u062c\u0645\u06c1\u0648\u0631\u06cc\u06c1 \u0686\u06cc\u0646",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "\u06c1\u062c\u0631\u06cc",
            };
        final String metaValue_calendarname_gregorian = "\u062c\u0627\u0631\u062c\u06cc\u0627\u0626\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u0633\u0627\u0644" },
            { "calendarname.islamic-umalqura", "\u0627\u0633\u0644\u0627\u0645\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631 (\u0627\u0645 \u0627\u0644\u0642\u0631\u0627\u06c1)" },
            { "arabext.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    ";",
                    "%",
                    "\u06f0",
                    "#",
                    "\u200e-\u200e",
                    "\u00d7\u06f1\u06f0^",
                    "\u2030",
                    "\u221e",
                    "NaN",
                    "",
                    "",
                }
            },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.gmtFormat", "GMT {0}" },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "\u0627\u0633\u0644\u0627\u0645\u06cc \u0634\u06c1\u0631\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_long_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "timezone.regionFormat.standard", "{0} \u0645\u0639\u06cc\u0627\u0631\u06cc \u0648\u0642\u062a" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u062c\u0627\u067e\u0627\u0646\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras", metaValue_long_Eras },
            { "roc.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
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
                    ".",
                    ",",
                    ";",
                    "%",
                    "0",
                    "#",
                    "\u200e-",
                    "E",
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
            { "field.minute", "\u0645\u0646\u0679" },
            { "field.era", "\u0639\u06c1\u062f" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "\u0642\u0628\u0644 \u062f\u0648\u067e\u06c1\u0631/\u0628\u0639\u062f \u062f\u0648\u067e\u06c1\u0631" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.MonthNames",
                new String[] {
                    "\u0645\u062d\u0631\u0645",
                    "\u0635\u0641\u0631",
                    "\u0631 \u0628\u06cc\u0639 \u0627\u0644\u0627\u0648\u0644",
                    "\u0631 \u0628\u06cc\u0639 \u0627\u0644\u062b\u0627\u0646\u06cc",
                    "\u062c\u0645\u0627\u062f\u06cc \u0627\u0644\u0627\u0648\u0644",
                    "\u062c\u0645\u0627\u062f\u06cc \u0627\u0644\u062b\u0627\u0646\u06cc",
                    "\u0631\u062c\u0628",
                    "\u0634\u0639\u0628\u0627\u0646",
                    "\u0631\u0645\u0636\u0627\u0646",
                    "\u0634\u0648\u0627\u0644",
                    "\u0630\u0648\u0627\u0644\u0642\u0639\u062f\u06c3",
                    "\u0630\u0648\u0627\u0644\u062d\u062c\u06c3",
                    "",
                }
            },
            { "japanese.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "calendarname.roc", "\u0645\u0646\u06af\u0648\u0648 \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "islamic.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.QuarterAbbreviations", metaValue_QuarterNames },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.month", "\u0645\u06c1\u06cc\u0646\u06c1" },
            { "arabext.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4#,##0.00",
                    "#,##0%",
                    "",
                }
            },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.second", "\u0633\u06cc\u06a9\u0646\u0688" },
            { "DayAbbreviations", metaValue_DayNames },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "\u0627\u0633\u0644\u0627\u0645\u06cc \u06a9\u06cc\u0644\u0646\u0688\u0631" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "midnight:00:00;night1:20:00-04:00;afternoon1:12:00-16:00;morning1:04:00-12:00;afternoon2:16:00-18:00;evening1:18:00-20:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "timezone.regionFormat", "{0} \u0648\u0642\u062a" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0' '\u06c1\u0632\u0627\u0631 other:0' '\u06c1\u0632\u0627\u0631}",
                    "{one:00' '\u06c1\u0632\u0627\u0631 other:00' '\u06c1\u0632\u0627\u0631}",
                    "{one:0' '\u0644\u0627\u06a9\u06be other:0' '\u0644\u0627\u06a9\u06be}",
                    "{one:00' '\u0644\u0627\u06a9\u06be other:00' '\u0644\u0627\u06a9\u06be}",
                    "{one:0' '\u06a9\u0631\u0648\u0691 other:0' '\u06a9\u0631\u0648\u0691}",
                    "{one:00' '\u06a9\u0631\u0648\u0691 other:00' '\u06a9\u0631\u0648\u0691}",
                    "{one:0' '\u0627\u0631\u0628 other:0' '\u0627\u0631\u0628}",
                    "{one:00' '\u0627\u0631\u0628 other:00' '\u0627\u0631\u0628}",
                    "{one:0' '\u06a9\u06be\u0631\u0628 other:0' '\u06a9\u06be\u0631\u0628}",
                    "{one:00' '\u06a9\u06be\u0631\u0628 other:00' '\u06a9\u06be\u0631\u0628}",
                    "{one:00' '\u0679\u0631\u06cc\u0644\u06cc\u0646 other:00' '\u0679\u0631\u06cc\u0644\u06cc\u0646}",
                    "{one:000' '\u0679\u0631\u06cc\u0644\u06cc\u0646 other:000' '\u0679\u0631\u06cc\u0644\u06cc\u0646}",
                }
            },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.DayAbbreviations", metaValue_DayNames },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_buddhist_DayNarrows },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.zone", "\u0645\u0646\u0637\u0642\u06c2 \u0648\u0642\u062a" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "Eras", metaValue_long_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "islamic.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "java.time.islamic.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "field.weekday", "\u06c1\u0641\u062a\u06d2 \u06a9\u0627 \u062f\u0646" },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.DayAbbreviations", metaValue_DayNames },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterNames },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayNames },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_long_Eras },
            { "field.week", "\u06c1\u0641\u062a\u06c1" },
            { "buddhist.MonthNarrows", metaValue_MonthNarrows },
            { "buddhist.QuarterNames", metaValue_QuarterNames },
            { "islamic.QuarterNarrows", metaValue_buddhist_QuarterNarrows },
            { "roc.DayNarrows", metaValue_buddhist_DayNarrows },
            { "roc.AmPmMarkers", metaValue_AmPmMarkers },
            { "java.time.roc.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "java.time.buddhist.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "short.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{one:0\u00a0\u06c1\u0632\u0627\u0631 other:0\u00a0\u06c1\u0632\u0627\u0631}",
                    "{one:00\u00a0\u06c1\u0632\u0627\u0631 other:00\u00a0\u06c1\u0632\u0627\u0631}",
                    "{one:0\u00a0\u0644\u0627\u06a9\u06be other:0\u00a0\u0644\u0627\u06a9\u06be}",
                    "{one:00\u00a0\u0644\u0627\u06a9\u06be other:00\u00a0\u0644\u0627\u06a9\u06be}",
                    "{one:0\u00a0\u06a9\u0631\u0648\u0691 other:0\u00a0\u06a9\u0631\u0648\u0691}",
                    "{one:00\u00a0\u06a9\u0631\u0648\u0691 other:00\u00a0\u06a9\u0631\u0648\u0691}",
                    "{one:0\u00a0\u0627\u0631\u0628 other:0\u00a0\u0627\u0631\u0628}",
                    "{one:00\u00a0\u0627\u0631\u0628 other:00\u00a0\u0627\u0631\u0628}",
                    "{one:0\u00a0\u06a9\u06be\u0631\u0628 other:0\u00a0\u06a9\u06be\u0631\u0628}",
                    "{one:00\u00a0\u06a9\u06be\u0631\u0628 other:00\u00a0\u06a9\u06be\u0631\u0628}",
                    "{one:00\u00a0\u0679\u0631\u06cc\u0644\u06cc\u0646 other:00\u00a0\u0679\u0631\u06cc\u0644\u06cc\u0646}",
                    "{one:000\u00a0\u0679\u0631\u06cc\u0644\u06cc\u0646 other:000\u00a0\u0679\u0631\u06cc\u0644\u06cc\u0646}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_long_Eras },
            { "timezone.regionFormat.daylight", "{0} \u0688\u06d2 \u0644\u0627\u0626\u0679 \u0679\u0627\u0626\u0645" },
            { "DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM\u060c y",
                    "d MMMM\u060c y",
                    "d MMM\u060c y",
                    "d/M/yy",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayNames },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.DayNames", metaValue_DayNames },
            { "PluralRules", "one:i = 1 and v = 0" },
            { "field.hour", "\u06af\u06be\u0646\u0679\u06c1" },
            { "islamic.MonthAbbreviations",
                new String[] {
                    "\u0645\u062d\u0631\u0645",
                    "\u0635\u0641\u0631",
                    "\u0631\u0628\u06cc\u0639 \u0627\u0644\u0627\u0648\u0651\u0644",
                    "\u0631\u0628\u06cc\u0639 \u0627\u0644\u062b\u0627\u0646\u06cc",
                    "\u062c\u0645\u0627\u062f\u06cc \u0627\u0644\u0627\u0648\u0651\u0644",
                    "\u062c\u0645\u0627\u062f\u06cc \u0627\u0644\u062b\u0627\u0646\u06cc",
                    "\u0631\u062c\u0628",
                    "\u0634\u0639\u0628\u0627\u0646",
                    "\u0631\u0645\u0636\u0627\u0646",
                    "\u0634\u0648\u0627\u0644",
                    "\u0630\u0648\u0627\u0644\u0642\u0639\u062f\u06c3",
                    "\u0630\u0648\u0627\u0644\u062d\u062c\u06c3",
                    "",
                }
            },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u0628\u0648\u062f\u06be \u06a9\u0644\u06cc\u0646\u0688\u0631" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "buddhist.DayNarrows", metaValue_buddhist_DayNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "japanese.DayNarrows", metaValue_buddhist_DayNarrows },
            { "QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
