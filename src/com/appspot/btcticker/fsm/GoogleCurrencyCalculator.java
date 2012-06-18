
// line 1 "GoogleCurrencyCalculator.ragel"
// Generated using:
// ragel -J -o src/com/appspot/btcticker/utils/GoogleCurrencyCalculator.java GoogleCurrencyCalculator.ragel
//
package com.appspot.btcticker.fsm;

public class GoogleCurrencyCalculator {
	
	public static final String EURO_URL  = "http://www.google.com/ig/calculator?hl=en&q=1USD=?EUR";
	public static final String POUND_URL = "http://www.google.com/ig/calculator?hl=en&q=1USD=?GBP";


// line 15 "src/com/appspot/btcticker/utils/GoogleCurrencyCalculator.java"
private static byte[] init__currency_converter_actions_0()
{
	return new byte [] {
	    0,    1,    1,    1,    2,    2,    0,    1
	};
}

private static final byte _currency_converter_actions[] = init__currency_converter_actions_0();


private static byte[] init__currency_converter_key_offsets_0()
{
	return new byte [] {
	    0,    0,    1,    2,    3,    4,    5,    9,   10,   11,   12,   13,
	   14,   15,   19,   21,   27,   28,   29,   30,   31,   32,   33,   34,
	   35,   39,   40,   41,   42,   43,   44,   45,   49,   50,   51,   52,
	   53,   55,   60
	};
}

private static final byte _currency_converter_key_offsets[] = init__currency_converter_key_offsets_0();


private static char[] init__currency_converter_trans_keys_0()
{
	return new char [] {
	  123,  108,  104,  115,   58,   32,   34,    9,   13,   34,   44,  114,
	  104,  115,   58,   32,   34,    9,   13,   48,   57,   32,   46,    9,
	   13,   48,   57,   34,   44,  101,  114,  114,  111,  114,   58,   32,
	   34,    9,   13,   34,   44,  105,   99,   99,   58,   32,  116,    9,
	   13,  114,  117,  101,  125,   48,   57,   32,    9,   13,   48,   57,
	    0
	};
}

private static final char _currency_converter_trans_keys[] = init__currency_converter_trans_keys_0();


private static byte[] init__currency_converter_single_lengths_0()
{
	return new byte [] {
	    0,    1,    1,    1,    1,    1,    2,    1,    1,    1,    1,    1,
	    1,    2,    0,    2,    1,    1,    1,    1,    1,    1,    1,    1,
	    2,    1,    1,    1,    1,    1,    1,    2,    1,    1,    1,    1,
	    0,    1,    0
	};
}

private static final byte _currency_converter_single_lengths[] = init__currency_converter_single_lengths_0();


private static byte[] init__currency_converter_range_lengths_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,    0,    0,
	    0,    1,    1,    2,    0,    0,    0,    0,    0,    0,    0,    0,
	    1,    0,    0,    0,    0,    0,    0,    1,    0,    0,    0,    0,
	    1,    2,    0
	};
}

private static final byte _currency_converter_range_lengths[] = init__currency_converter_range_lengths_0();


private static byte[] init__currency_converter_index_offsets_0()
{
	return new byte [] {
	    0,    0,    2,    4,    6,    8,   10,   14,   16,   18,   20,   22,
	   24,   26,   30,   32,   37,   39,   41,   43,   45,   47,   49,   51,
	   53,   57,   59,   61,   63,   65,   67,   69,   73,   75,   77,   79,
	   81,   83,   87
	};
}

private static final byte _currency_converter_index_offsets[] = init__currency_converter_index_offsets_0();


private static byte[] init__currency_converter_indicies_0()
{
	return new byte [] {
	    0,    1,    2,    1,    3,    1,    4,    1,    5,    1,    5,    6,
	    5,    1,    7,    6,    8,    1,    9,    1,   10,    1,   11,    1,
	   12,    1,   12,   13,   12,    1,   14,    1,   15,   16,   15,   17,
	    1,   18,   15,   19,    1,   20,    1,   21,    1,   22,    1,   23,
	    1,   24,    1,   25,    1,   25,   26,   25,    1,   27,    1,   28,
	    1,   29,    1,   30,    1,   31,    1,   32,    1,   32,   33,   32,
	    1,   34,    1,   35,    1,   36,    1,   37,    1,   38,    1,   15,
	   15,   38,    1,    1,    0
	};
}

private static final byte _currency_converter_indicies[] = init__currency_converter_indicies_0();


private static byte[] init__currency_converter_trans_targs_0()
{
	return new byte [] {
	    2,    0,    3,    4,    5,    6,    7,    8,    9,   10,   11,   12,
	   13,   14,   15,   16,   36,   15,   17,   18,   19,   20,   21,   22,
	   23,   24,   25,   26,   27,   28,   29,   30,   31,   32,   33,   34,
	   35,   38,   37
	};
}

private static final byte _currency_converter_trans_targs[] = init__currency_converter_trans_targs_0();


private static byte[] init__currency_converter_trans_actions_0()
{
	return new byte [] {
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    5,    0,    0,    1,    0,    0,    0,    0,    0,    0,
	    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,    0,
	    0,    0,    3
	};
}

private static final byte _currency_converter_trans_actions[] = init__currency_converter_trans_actions_0();


static final int currency_converter_start = 1;
static final int currency_converter_first_final = 38;
static final int currency_converter_error = 0;

static final int currency_converter_en_main = 1;


// line 34 "GoogleCurrencyCalculator.ragel"


	public double extract(String response) {
	   char[] data = response.toCharArray();
        
        // Used by Ragel
        int cs;
        int p = 0;
        int pe = data.length;
        
        // Used to store extracted data
        final int zero = (int) '0';
        int i = 0;
        double f = 0.0;
        double scale = 1.0;
        
        
// line 161 "src/com/appspot/btcticker/utils/GoogleCurrencyCalculator.java"
	{
	cs = currency_converter_start;
	}

// line 51 "GoogleCurrencyCalculator.ragel"
        
// line 168 "src/com/appspot/btcticker/utils/GoogleCurrencyCalculator.java"
	{
	int _klen;
	int _trans = 0;
	int _acts;
	int _nacts;
	int _keys;
	int _goto_targ = 0;

	_goto: while (true) {
	switch ( _goto_targ ) {
	case 0:
	if ( p == pe ) {
		_goto_targ = 4;
		continue _goto;
	}
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
case 1:
	_match: do {
	_keys = _currency_converter_key_offsets[cs];
	_trans = _currency_converter_index_offsets[cs];
	_klen = _currency_converter_single_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + _klen - 1;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + ((_upper-_lower) >> 1);
			if ( data[p] < _currency_converter_trans_keys[_mid] )
				_upper = _mid - 1;
			else if ( data[p] > _currency_converter_trans_keys[_mid] )
				_lower = _mid + 1;
			else {
				_trans += (_mid - _keys);
				break _match;
			}
		}
		_keys += _klen;
		_trans += _klen;
	}

	_klen = _currency_converter_range_lengths[cs];
	if ( _klen > 0 ) {
		int _lower = _keys;
		int _mid;
		int _upper = _keys + (_klen<<1) - 2;
		while (true) {
			if ( _upper < _lower )
				break;

			_mid = _lower + (((_upper-_lower) >> 1) & ~1);
			if ( data[p] < _currency_converter_trans_keys[_mid] )
				_upper = _mid - 2;
			else if ( data[p] > _currency_converter_trans_keys[_mid+1] )
				_lower = _mid + 2;
			else {
				_trans += ((_mid - _keys)>>1);
				break _match;
			}
		}
		_trans += _klen;
	}
	} while (false);

	_trans = _currency_converter_indicies[_trans];
	cs = _currency_converter_trans_targs[_trans];

	if ( _currency_converter_trans_actions[_trans] != 0 ) {
		_acts = _currency_converter_trans_actions[_trans];
		_nacts = (int) _currency_converter_actions[_acts++];
		while ( _nacts-- > 0 )
	{
			switch ( _currency_converter_actions[_acts++] )
			{
	case 0:
// line 15 "GoogleCurrencyCalculator.ragel"
	{ i = 0; f = 0.0; scale = 1.0; }
	break;
	case 1:
// line 16 "GoogleCurrencyCalculator.ragel"
	{ i = i * 10 + (int)data[p] - zero; }
	break;
	case 2:
// line 17 "GoogleCurrencyCalculator.ragel"
	{ scale = scale * 0.1; f = f + scale * ((int)data[p] - zero); }
	break;
// line 260 "src/com/appspot/btcticker/utils/GoogleCurrencyCalculator.java"
			}
		}
	}

case 2:
	if ( cs == 0 ) {
		_goto_targ = 5;
		continue _goto;
	}
	if ( ++p != pe ) {
		_goto_targ = 1;
		continue _goto;
	}
case 4:
case 5:
	}
	break; }
	}

// line 52 "GoogleCurrencyCalculator.ragel"
        
        if (cs < currency_converter_first_final) {
        	return -1.0;
        }
        else {
        	return i + f;
        }
	}
}