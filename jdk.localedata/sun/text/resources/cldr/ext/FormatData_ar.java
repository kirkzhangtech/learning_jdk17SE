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

public class FormatData_ar extends ListResourceBundle {
    @Override
    protected final Object[][] getContents() {
        final String[] metaValue_MonthNames = new String[] {
               "\u064a\u0646\u0627\u064a\u0631",
               "\u0641\u0628\u0631\u0627\u064a\u0631",
               "\u0645\u0627\u0631\u0633",
               "\u0623\u0628\u0631\u064a\u0644",
               "\u0645\u0627\u064a\u0648",
               "\u064a\u0648\u0646\u064a\u0648",
               "\u064a\u0648\u0644\u064a\u0648",
               "\u0623\u063a\u0633\u0637\u0633",
               "\u0633\u0628\u062a\u0645\u0628\u0631",
               "\u0623\u0643\u062a\u0648\u0628\u0631",
               "\u0646\u0648\u0641\u0645\u0628\u0631",
               "\u062f\u064a\u0633\u0645\u0628\u0631",
               "",
            };
        final String[] metaValue_MonthNarrows = new String[] {
               "\u064a",
               "\u0641",
               "\u0645",
               "\u0623",
               "\u0648",
               "\u0646",
               "\u0644",
               "\u063a",
               "\u0633",
               "\u0643",
               "\u0628",
               "\u062f",
               "",
            };
        final String[] metaValue_DayNames = new String[] {
               "\u0627\u0644\u0623\u062d\u062f",
               "\u0627\u0644\u0627\u062b\u0646\u064a\u0646",
               "\u0627\u0644\u062b\u0644\u0627\u062b\u0627\u0621",
               "\u0627\u0644\u0623\u0631\u0628\u0639\u0627\u0621",
               "\u0627\u0644\u062e\u0645\u064a\u0633",
               "\u0627\u0644\u062c\u0645\u0639\u0629",
               "\u0627\u0644\u0633\u0628\u062a",
            };
        final String[] metaValue_DayNarrows = new String[] {
               "\u062d",
               "\u0646",
               "\u062b",
               "\u0631",
               "\u062e",
               "\u062c",
               "\u0633",
            };
        final String[] metaValue_QuarterNames = new String[] {
               "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u0623\u0648\u0644",
               "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u062b\u0627\u0646\u064a",
               "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u062b\u0627\u0644\u062b",
               "\u0627\u0644\u0631\u0628\u0639 \u0627\u0644\u0631\u0627\u0628\u0639",
            };
        final String[] metaValue_QuarterNarrows = new String[] {
               "\u0661",
               "\u0662",
               "\u0663",
               "\u0664",
            };
        final String[] metaValue_AmPmMarkers = new String[] {
               "\u0635",
               "\u0645",
               "",
               "",
               "\u0641\u064a \u0627\u0644\u0635\u0628\u0627\u062d",
               "\u0635\u0628\u0627\u062d\u064b\u0627",
               "\u0638\u0647\u0631\u064b\u0627",
               "\u0628\u0639\u062f \u0627\u0644\u0638\u0647\u0631",
               "\u0645\u0633\u0627\u0621\u064b",
               "",
               "\u0641\u064a \u0627\u0644\u0645\u0633\u0627\u0621",
               "\u0644\u064a\u0644\u0627\u064b",
            };
        final String[] metaValue_narrow_AmPmMarkers = new String[] {
               "\u0635",
               "\u0645",
               "",
               "",
               "\u0641\u062c\u0631\u064b\u0627",
               "\u0635\u0628\u0627\u062d\u064b\u0627",
               "\u0638\u0647\u0631\u064b\u0627",
               "\u0628\u0639\u062f \u0627\u0644\u0638\u0647\u0631",
               "\u0645\u0633\u0627\u0621\u064b",
               "",
               "\u0645\u0646\u062a\u0635\u0641 \u0627\u0644\u0644\u064a\u0644",
               "\u0644\u064a\u0644\u0627\u064b",
            };
        final String[] metaValue_abbreviated_AmPmMarkers = new String[] {
               "\u0635",
               "\u0645",
               "",
               "",
               "\u0641\u062c\u0631\u064b\u0627",
               "\u0635",
               "\u0638\u0647\u0631\u064b\u0627",
               "\u0628\u0639\u062f \u0627\u0644\u0638\u0647\u0631",
               "\u0645\u0633\u0627\u0621\u064b",
               "",
               "\u0641\u064a \u0627\u0644\u0645\u0633\u0627\u0621",
               "\u0644\u064a\u0644\u0627\u064b",
            };
        final String[] metaValue_Eras = new String[] {
               "\u0642.\u0645",
               "\u0645",
            };
        final String[] metaValue_TimePatterns = new String[] {
               "h:mm:ss a zzzz",
               "h:mm:ss a z",
               "h:mm:ss a",
               "h:mm a",
            };
        final String[] metaValue_java_time_buddhist_long_Eras = new String[] {
               "BC",
               "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0628\u0648\u0630\u064a",
            };
        final String[] metaValue_java_time_buddhist_Eras = new String[] {
               "BC",
               "BE",
            };
        final String[] metaValue_java_time_buddhist_DatePatterns = new String[] {
               "EEEE\u060c d MMMM y G",
               "d MMMM y G",
               "dd\u200f/MM\u200f/y G",
               "d\u200f/M\u200f/y GGGGG",
            };
        final String[] metaValue_buddhist_DatePatterns = new String[] {
               "EEEE\u060c d MMMM y GGGG",
               "d MMMM y GGGG",
               "dd\u200f/MM\u200f/y GGGG",
               "d\u200f/M\u200f/y G",
            };
        final String[] metaValue_java_time_japanese_long_Eras = new String[] {
               "\u0645\u064a\u0644\u0627\u062f\u064a",
               "\u0645\u064a\u062c\u064a",
               "\u062a\u064a\u0634\u0648",
               "\u0634\u0648\u0648\u0627",
               "\u0647\u064a\u0633\u064a",
               "\u0631\u064a\u0648\u0627",
            };
        final String[] metaValue_java_time_japanese_Eras = new String[] {
               "\u0645",
               "\u0645\u064a\u062c\u064a",
               "\u062a\u064a\u0634\u0648",
               "\u0634\u0648\u0648\u0627",
               "\u0647\u064a\u0633\u064a",
               "\u0631\u064a\u0648\u0627",
            };
        final String[] metaValue_java_time_roc_long_Eras = new String[] {
               "Before R.O.C.",
               "\u062c\u0645\u0647\u0648\u0631\u064a\u0629 \u0627\u0644\u0635\u064a",
            };
        final String[] metaValue_islamic_MonthNames = new String[] {
               "\u0645\u062d\u0631\u0645",
               "\u0635\u0641\u0631",
               "\u0631\u0628\u064a\u0639 \u0627\u0644\u0623\u0648\u0644",
               "\u0631\u0628\u064a\u0639 \u0627\u0644\u0622\u062e\u0631",
               "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0623\u0648\u0644\u0649",
               "\u062c\u0645\u0627\u062f\u0649 \u0627\u0644\u0622\u062e\u0631\u0629",
               "\u0631\u062c\u0628",
               "\u0634\u0639\u0628\u0627\u0646",
               "\u0631\u0645\u0636\u0627\u0646",
               "\u0634\u0648\u0627\u0644",
               "\u0630\u0648 \u0627\u0644\u0642\u0639\u062f\u0629",
               "\u0630\u0648 \u0627\u0644\u062d\u062c\u0629",
               "",
            };
        final String[] metaValue_java_time_islamic_long_Eras = new String[] {
               "",
               "\u0647\u0640",
            };
        final String metaValue_calendarname_gregorian = "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0645\u064a\u0644\u0627\u062f\u064a";
        final Object[][] data = new Object[][] {
            { "MonthNames", metaValue_MonthNames },
            { "field.year", "\u0627\u0644\u0633\u0646\u0629" },
            { "calendarname.islamic-umalqura", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0625\u0633\u0644\u0627\u0645\u064a (\u0623\u0645 \u0627\u0644\u0642\u0631\u0649)" },
            { "japanese.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "AmPmMarkers", metaValue_AmPmMarkers },
            { "timezone.gmtFormat", "\u063a\u0631\u064a\u0646\u062a\u0634{0}" },
            { "java.time.japanese.DatePatterns", metaValue_java_time_buddhist_DatePatterns },
            { "standalone.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.QuarterNames", metaValue_QuarterNames },
            { "roc.MonthNarrows", metaValue_MonthNarrows },
            { "calendarname.islamic-civil", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0625\u0633\u0644\u0627\u0645\u064a \u0627\u0644\u0645\u062f\u0646\u064a" },
            { "islamic.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "japanese.TimePatterns", metaValue_TimePatterns },
            { "narrow.Eras", metaValue_Eras },
            { "roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "timezone.regionFormat.standard", "\u062a\u0648\u0642\u064a\u062a {0} \u0627\u0644\u0631\u0633\u0645\u064a" },
            { "DefaultNumberingSystem", "arab" },
            { "japanese.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.japanese", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u064a\u0627\u0628\u0627\u0646\u064a" },
            { "timezone.gmtZeroFormat", "\u063a\u0631\u064a\u0646\u062a\u0634" },
            { "japanese.MonthNames", metaValue_MonthNames },
            { "standalone.DayAbbreviations", metaValue_DayNames },
            { "roc.MonthAbbreviations", metaValue_MonthNames },
            { "java.time.islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "long.Eras",
                new String[] {
                    "\u0642\u0628\u0644 \u0627\u0644\u0645\u064a\u0644\u0627\u062f",
                    "\u0645\u064a\u0644\u0627\u062f\u064a",
                }
            },
            { "roc.QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic.DayNames", metaValue_DayNames },
            { "buddhist.MonthAbbreviations", metaValue_MonthNames },
            { "buddhist.MonthNames", metaValue_MonthNames },
            { "DateTimePatterns",
                new String[] {
                    "{1} \u0641\u064a {0}",
                    "{1} \u0641\u064a {0}",
                    "{1}, {0}",
                    "{1}, {0}",
                }
            },
            { "narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "latn.NumberElements",
                new String[] {
                    ".",
                    ",",
                    ";",
                    "\u200e%\u200e",
                    "0",
                    "#",
                    "\u200e-",
                    "E",
                    "\u2030",
                    "\u221e",
                    "\u0644\u064a\u0633\u00a0\u0631\u0642\u0645\u064b\u0627",
                    "",
                    "",
                }
            },
            { "MonthNarrows", metaValue_MonthNarrows },
            { "japanese.DatePatterns", metaValue_buddhist_DatePatterns },
            { "buddhist.DayNames", metaValue_DayNames },
            { "field.minute", "\u0627\u0644\u062f\u0642\u0627\u0626\u0642" },
            { "japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "field.era", "\u0627\u0644\u0639\u0635\u0631" },
            { "buddhist.AmPmMarkers", metaValue_AmPmMarkers },
            { "field.dayperiod", "\u0635/\u0645" },
            { "standalone.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.MonthNames", metaValue_islamic_MonthNames },
            { "japanese.QuarterNarrows", metaValue_QuarterNarrows },
            { "arab.NumberElements",
                new String[] {
                    "\u066b",
                    "\u066c",
                    "\u061b",
                    "\u066a\u061c",
                    "\u0660",
                    "#",
                    "\u061c-",
                    "\u0627\u0633",
                    "\u0609",
                    "\u221e",
                    "\u0644\u064a\u0633\u00a0\u0631\u0642\u0645",
                    "",
                    "",
                }
            },
            { "calendarname.roc", "\u062a\u0642\u0648\u064a\u0645 \u0645\u064a\u0646\u062c\u0648" },
            { "islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y GGGG",
                    "d MMMM y GGGG",
                    "d MMM y GGGG",
                    "d\u200f/M\u200f/y G",
                }
            },
            { "roc.QuarterAbbreviations", metaValue_QuarterNames },
            { "islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "field.month", "\u0627\u0644\u0634\u0647\u0631" },
            { "java.time.japanese.long.Eras", metaValue_java_time_japanese_long_Eras },
            { "roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.second", "\u0627\u0644\u062b\u0648\u0627\u0646\u064a" },
            { "islamic.MonthNarrows",
                new String[] {
                    "\u0661",
                    "\u0662",
                    "\u0663",
                    "\u0664",
                    "\u0665",
                    "\u0666",
                    "\u0667",
                    "\u0668",
                    "\u0669",
                    "\u0661\u0660",
                    "\u0661\u0661",
                    "\u0661\u0662",
                    "",
                }
            },
            { "DayAbbreviations", metaValue_DayNames },
            { "DayNarrows", metaValue_DayNarrows },
            { "roc.DatePatterns", metaValue_buddhist_DatePatterns },
            { "calendarname.islamic", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0647\u062c\u0631\u064a" },
            { "java.time.roc.long.Eras", metaValue_java_time_roc_long_Eras },
            { "DayPeriodRules", "night1:00:00-01:00;morning2:06:00-12:00;afternoon1:12:00-13:00;morning1:03:00-06:00;afternoon2:13:00-18:00;evening1:18:00-24:00;night2:01:00-03:00" },
            { "java.time.roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "japanese.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.TimePatterns", metaValue_TimePatterns },
            { "standalone.MonthAbbreviations", metaValue_MonthNames },
            { "timezone.regionFormat", "\u062a\u0648\u0642\u064a\u062a {0}" },
            { "long.CompactNumberPatterns",
                new String[] {
                    "",
                    "",
                    "",
                    "{zero:0' '\u0623\u0644\u0641 one:0' '\u0623\u0644\u0641 two:0' '\u0623\u0644\u0641 few:0' '\u0622\u0644\u0627\u0641 many:0' '\u0623\u0644\u0641 other:0' '\u0623\u0644\u0641}",
                    "{zero:00' '\u0623\u0644\u0641 one:00' '\u0623\u0644\u0641 two:00' '\u0623\u0644\u0641 few:00' '\u0623\u0644\u0641 many:00' '\u0623\u0644\u0641 other:00' '\u0623\u0644\u0641}",
                    "{zero:000' '\u0623\u0644\u0641 one:000' '\u0623\u0644\u0641 two:000' '\u0623\u0644\u0641 few:000' '\u0623\u0644\u0641 many:000' '\u0623\u0644\u0641 other:000' '\u0623\u0644\u0641}",
                    "{zero:0' '\u0645\u0644\u064a\u0648\u0646 one:0' '\u0645\u0644\u064a\u0648\u0646 two:0' '\u0645\u0644\u064a\u0648\u0646 few:0' '\u0645\u0644\u0627\u064a\u064a\u0646 many:0' '\u0645\u0644\u064a\u0648\u0646 other:0' '\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:00' '\u0645\u0644\u064a\u0648\u0646 one:00' '\u0645\u0644\u064a\u0648\u0646 two:00' '\u0645\u0644\u064a\u0648\u0646 few:00' '\u0645\u0644\u0627\u064a\u064a\u0646 many:00' '\u0645\u0644\u064a\u0648\u0646 other:00' '\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:000' '\u0645\u0644\u064a\u0648\u0646 one:000' '\u0645\u0644\u064a\u0648\u0646 two:000' '\u0645\u0644\u064a\u0648\u0646 few:000' '\u0645\u0644\u064a\u0648\u0646 many:000' '\u0645\u0644\u064a\u0648\u0646 other:000' '\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:0' '\u0645\u0644\u064a\u0627\u0631 one:0' '\u0645\u0644\u064a\u0627\u0631 two:0' '\u0645\u0644\u064a\u0627\u0631 few:0' '\u0645\u0644\u064a\u0627\u0631 many:0' '\u0645\u0644\u064a\u0627\u0631 other:0' '\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:00' '\u0645\u0644\u064a\u0627\u0631 one:00' '\u0645\u0644\u064a\u0627\u0631 two:00' '\u0645\u0644\u064a\u0627\u0631 few:00' '\u0645\u0644\u064a\u0627\u0631 many:00' '\u0645\u0644\u064a\u0627\u0631 other:00' '\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:000' '\u0645\u0644\u064a\u0627\u0631 one:000' '\u0645\u0644\u064a\u0627\u0631 two:000' '\u0645\u0644\u064a\u0627\u0631 few:000' '\u0645\u0644\u064a\u0627\u0631 many:000' '\u0645\u0644\u064a\u0627\u0631 other:000' '\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:0' '\u062a\u0631\u0644\u064a\u0648\u0646 one:0' '\u062a\u0631\u0644\u064a\u0648\u0646 two:0' '\u062a\u0631\u0644\u064a\u0648\u0646 few:0' '\u062a\u0631\u0644\u064a\u0648\u0646 many:0' '\u062a\u0631\u0644\u064a\u0648\u0646 other:0' '\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{zero:00' '\u062a\u0631\u0644\u064a\u0648\u0646 one:00' '\u062a\u0631\u0644\u064a\u0648\u0646 two:00' '\u062a\u0631\u0644\u064a\u0648\u0646 few:00' '\u062a\u0631\u0644\u064a\u0648\u0646 many:00' '\u062a\u0631\u0644\u064a\u0648\u0646 other:00' '\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{zero:000' '\u062a\u0631\u0644\u064a\u0648\u0646 one:000' '\u062a\u0631\u0644\u064a\u0648\u0646 two:000' '\u062a\u0631\u0644\u064a\u0648\u0646 few:000' '\u062a\u0631\u0644\u064a\u0648\u0646 many:000' '\u062a\u0631\u0644\u064a\u0648\u0646 other:000' '\u062a\u0631\u0644\u064a\u0648\u0646}",
                }
            },
            { "buddhist.QuarterNarrows", metaValue_QuarterNarrows },
            { "roc.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "standalone.QuarterNames", metaValue_QuarterNames },
            { "japanese.MonthNarrows", metaValue_MonthNarrows },
            { "islamic.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.DayAbbreviations", metaValue_DayNames },
            { "standalone.DayNarrows", metaValue_DayNarrows },
            { "java.time.buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "islamic.AmPmMarkers", metaValue_AmPmMarkers },
            { "buddhist.long.Eras", metaValue_java_time_buddhist_long_Eras },
            { "TimePatterns", metaValue_TimePatterns },
            { "islamic.DayNarrows", metaValue_DayNarrows },
            { "java.time.roc.Eras", metaValue_java_time_roc_long_Eras },
            { "field.zone", "\u0627\u0644\u062a\u0648\u0642\u064a\u062a" },
            { "japanese.QuarterAbbreviations", metaValue_QuarterNames },
            { "roc.narrow.Eras", metaValue_java_time_roc_long_Eras },
            { "arab.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "#,##0.00\u00a0\u00a4",
                    "#,##0%",
                    "",
                }
            },
            { "buddhist.narrow.AmPmMarkers", metaValue_narrow_AmPmMarkers },
            { "buddhist.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "Eras", metaValue_Eras },
            { "roc.DayNames", metaValue_DayNames },
            { "islamic.QuarterNames", metaValue_QuarterNames },
            { "QuarterNarrows", metaValue_QuarterNarrows },
            { "islamic.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "standalone.QuarterNarrows", metaValue_QuarterNarrows },
            { "java.time.islamic.DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y G",
                    "d MMMM y G",
                    "d MMM y G",
                    "d\u200f/M\u200f/y GGGGG",
                }
            },
            { "field.weekday", "\u0627\u0644\u064a\u0648\u0645" },
            { "japanese.MonthAbbreviations", metaValue_MonthNames },
            { "islamic.DayAbbreviations", metaValue_DayNames },
            { "islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "java.time.islamic.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.QuarterNames", metaValue_QuarterNames },
            { "buddhist.QuarterAbbreviations", metaValue_QuarterNames },
            { "java.time.buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "japanese.DayNames", metaValue_DayNames },
            { "japanese.DayAbbreviations", metaValue_DayNames },
            { "DayNames", metaValue_DayNames },
            { "buddhist.DatePatterns", metaValue_buddhist_DatePatterns },
            { "java.time.japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.MonthNames", metaValue_MonthNames },
            { "buddhist.Eras", metaValue_java_time_buddhist_Eras },
            { "field.week", "\u0627\u0644\u0623\u0633\u0628\u0648\u0639" },
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
                    "{zero:0\u00a0\u0623\u0644\u0641 one:0\u00a0\u0623\u0644\u0641 two:0\u00a0\u0623\u0644\u0641 few:0\u00a0\u0622\u0644\u0627\u0641 many:0\u00a0\u0623\u0644\u0641 other:0\u00a0\u0623\u0644\u0641}",
                    "{zero:00\u00a0\u0623\u0644\u0641 one:00\u00a0\u0623\u0644\u0641 two:00\u00a0\u0623\u0644\u0641 few:00\u00a0\u0623\u0644\u0641 many:00\u00a0\u0623\u0644\u0641 other:00\u00a0\u0623\u0644\u0641}",
                    "{zero:000\u00a0\u0623\u0644\u0641 one:000\u00a0\u0623\u0644\u0641 two:000\u00a0\u0623\u0644\u0641 few:000\u00a0\u0623\u0644\u0641 many:000\u00a0\u0623\u0644\u0641 other:000\u00a0\u0623\u0644\u0641}",
                    "{zero:0\u00a0\u0645\u0644\u064a\u0648\u0646 one:0\u00a0\u0645\u0644\u064a\u0648\u0646 two:0\u00a0\u0645\u0644\u064a\u0648\u0646 few:0\u00a0\u0645\u0644\u064a\u0648\u0646 many:0\u00a0\u0645\u0644\u064a\u0648\u0646 other:0\u00a0\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:00\u00a0\u0645\u0644\u064a\u0648\u0646 one:00\u00a0\u0645\u0644\u064a\u0648\u0646 two:00\u00a0\u0645\u0644\u064a\u0648\u0646 few:00\u00a0\u0645\u0644\u064a\u0648\u0646 many:00\u00a0\u0645\u0644\u064a\u0648\u0646 other:00\u00a0\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:000\u00a0\u0645\u0644\u064a\u0648\u0646 one:000\u00a0\u0645\u0644\u064a\u0648\u0646 two:000\u00a0\u0645\u0644\u064a\u0648\u0646 few:000\u00a0\u0645\u0644\u064a\u0648\u0646 many:000\u00a0\u0645\u0644\u064a\u0648\u0646 other:000\u00a0\u0645\u0644\u064a\u0648\u0646}",
                    "{zero:0\u00a0\u0645\u0644\u064a\u0627\u0631 one:0\u00a0\u0645\u0644\u064a\u0627\u0631 two:0\u00a0\u0645\u0644\u064a\u0627\u0631 few:0\u00a0\u0645\u0644\u064a\u0627\u0631 many:0\u00a0\u0645\u0644\u064a\u0627\u0631 other:0\u00a0\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:00\u00a0\u0645\u0644\u064a\u0627\u0631 one:00\u00a0\u0645\u0644\u064a\u0627\u0631 two:00\u00a0\u0645\u0644\u064a\u0627\u0631 few:00\u00a0\u0645\u0644\u064a\u0627\u0631 many:00\u00a0\u0645\u0644\u064a\u0627\u0631 other:00\u00a0\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:000\u00a0\u0645\u0644\u064a\u0627\u0631 one:000\u00a0\u0645\u0644\u064a\u0627\u0631 two:000\u00a0\u0645\u0644\u064a\u0627\u0631 few:000\u00a0\u0645\u0644\u064a\u0627\u0631 many:000\u00a0\u0645\u0644\u064a\u0627\u0631 other:000\u00a0\u0645\u0644\u064a\u0627\u0631}",
                    "{zero:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 one:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 two:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 few:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 many:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 other:0\u00a0\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{zero:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 one:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 two:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 few:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 many:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 other:00\u00a0\u062a\u0631\u0644\u064a\u0648\u0646}",
                    "{zero:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 one:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 two:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 few:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 many:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646 other:000\u00a0\u062a\u0631\u0644\u064a\u0648\u0646}",
                }
            },
            { "calendarname.gregorian", metaValue_calendarname_gregorian },
            { "java.time.buddhist.narrow.Eras", metaValue_java_time_buddhist_Eras },
            { "timezone.regionFormat.daylight", "\u062a\u0648\u0642\u064a\u062a {0} \u0627\u0644\u0635\u064a\u0641\u064a" },
            { "DatePatterns",
                new String[] {
                    "EEEE\u060c d MMMM y",
                    "d MMMM y",
                    "dd\u200f/MM\u200f/y",
                    "d\u200f/M\u200f/y",
                }
            },
            { "buddhist.DayAbbreviations", metaValue_DayNames },
            { "islamic.TimePatterns", metaValue_TimePatterns },
            { "MonthAbbreviations", metaValue_MonthNames },
            { "standalone.DayNames", metaValue_DayNames },
            { "PluralRules", "zero:n = 0;one:n = 1;few:n % 100 = 3..10;many:n % 100 = 11..99;two:n = 2" },
            { "field.hour", "\u0627\u0644\u0633\u0627\u0639\u0627\u062a" },
            { "islamic.MonthAbbreviations", metaValue_islamic_MonthNames },
            { "islamic.narrow.Eras", metaValue_java_time_islamic_long_Eras },
            { "calendarname.buddhist", "\u0627\u0644\u062a\u0642\u0648\u064a\u0645 \u0627\u0644\u0628\u0648\u0630\u064a" },
            { "standalone.MonthNames", metaValue_MonthNames },
            { "latn.NumberPatterns",
                new String[] {
                    "#,##0.###",
                    "\u00a4\u00a0#,##0.00",
                    "#,##0%",
                    "\u00a4#,##0.00;(\u00a4#,##0.00)",
                }
            },
            { "buddhist.DayNarrows", metaValue_DayNarrows },
            { "java.time.islamic.long.Eras", metaValue_java_time_islamic_long_Eras },
            { "japanese.DayNarrows", metaValue_DayNarrows },
            { "QuarterNames", metaValue_QuarterNames },
            { "roc.TimePatterns", metaValue_TimePatterns },
            { "QuarterAbbreviations", metaValue_QuarterNames },
            { "japanese.Eras", metaValue_java_time_japanese_Eras },
            { "roc.abbreviated.AmPmMarkers", metaValue_abbreviated_AmPmMarkers },
            { "calendarname.gregory", metaValue_calendarname_gregorian },
        };
        return data;
    }
}
